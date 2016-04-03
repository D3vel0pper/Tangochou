package d3vel0pper.com.tangochou.fragment;

<<<<<<< HEAD
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.content.Intent;
=======
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
>>>>>>> addCV
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
<<<<<<< HEAD
import android.widget.Button;
import android.widget.FrameLayout;

import java.util.ArrayList;
import java.util.List;

import d3vel0pper.com.tangochou.R;
//import d3vel0pper.com.tangochou.addapter.CardPagerAdapter;
import d3vel0pper.com.tangochou.activity.MainActivity;
import d3vel0pper.com.tangochou.activity.VPActivity;
import d3vel0pper.com.tangochou.commons.ListData;
=======
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import d3vel0pper.com.tangochou.R;
import d3vel0pper.com.tangochou.activity.MainActivity;
import d3vel0pper.com.tangochou.addapter.CardListAddapter;
>>>>>>> addCV

/**
 * Created by taka-dhu on 2015/12/09.
 */
public class WordCardListFragment extends Fragment {
<<<<<<< HEAD

    private Activity parent;

=======
    private CardFragment cardFragment;
    private ListView listView;
    private Context context;
    private static String[] teststr = {"Hoge","foo","hogehoge","Foo"};
>>>>>>> addCV
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
<<<<<<< HEAD
        View v = inflater.inflate(R.layout.wordcardlistfragment,null);
        Button crActBtn = (Button)v.findViewById(R.id.CrActivity);
        crActBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                parent = getActivity();
                Intent intent = new Intent(parent, VPActivity.class);
                startActivity(intent);
            }
        });
=======
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

>>>>>>> addCV
        return v;
    }

    class PageChangeListener extends ViewPager.SimpleOnPageChangeListener {
        @Override
        public void onPageSelected(int position){

        }
    }

}
