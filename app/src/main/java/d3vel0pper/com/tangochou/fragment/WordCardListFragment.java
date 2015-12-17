package d3vel0pper.com.tangochou.fragment;

import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import d3vel0pper.com.tangochou.R;
import d3vel0pper.com.tangochou.activity.MainActivity;
import d3vel0pper.com.tangochou.addapter.CardListAddapter;

/**
 * Created by taka-dhu on 2015/12/09.
 */
public class WordCardListFragment extends Fragment {
    private CardFragment cardFragment;
    private ListView listView;
    private Context context;
    private static String[] teststr = {"Hoge","foo","hogehoge","Foo"};
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        this.context = getActivity();
        View v = inflater.inflate(R.layout.wordcardlistfragment,container,false);
        listView = (ListView)v.findViewById(R.id.cardList);
        CardListAddapter adapter = new CardListAddapter(context,teststr);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            //selected
            @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                ListView listview = (ListView)parent;
                String item = (String)listview.getItemAtPosition(position);

                //fragment manage
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if(cardFragment == null){
                    cardFragment = new CardFragment();
                }
                fragmentTransaction.replace(R.id.container,cardFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

                //Toast.makeText(context,item + "clicked",Toast.LENGTH_SHORT).show();
            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener(){
            @Override
        public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id){
                ListView listview = (ListView) parent;
                String item = (String) listview.getItemAtPosition(position);

                //add for give ListView for dialog
                String[] dialog_items = {"タイトル変更","編集","削除"};
                LayoutInflater li = LayoutInflater.from(getActivity());
                View Dialogview = li.inflate(R.layout.dialog_layout,(ListView)view.findViewById(R.id.dialog_container));
                ListView lv = (ListView)Dialogview.findViewById(R.id.dialog_container);
                CardListAddapter dialogAdapter = new CardListAddapter(context,dialog_items);
                lv.setAdapter(dialogAdapter);

                new AlertDialog.Builder(getActivity())
                        .setView(Dialogview).setPositiveButton("Close",new DialogInterface.OnClickListener(){
                    @Override
                public void onClick(DialogInterface dialog,int whitch){
                    }
                }).show();

                return false;
            }
        });

        return v;
    }
}
