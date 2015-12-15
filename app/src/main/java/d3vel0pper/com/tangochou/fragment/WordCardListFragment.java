package d3vel0pper.com.tangochou.fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import d3vel0pper.com.tangochou.R;
import d3vel0pper.com.tangochou.addapter.CardListAddapter;

/**
 * Created by taka-dhu on 2015/12/09.
 */
public class WordCardListFragment extends Fragment {
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
                Toast.makeText(context,item + "clicked",Toast.LENGTH_SHORT).show();
            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener(){
            @Override
        public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id){
                ListView listview = (ListView) parent;
                String item = (String) listview.getItemAtPosition(position);
                Toast.makeText(context,item + "longtaped",Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        return v;
    }
}
