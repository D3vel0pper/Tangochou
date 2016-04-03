package d3vel0pper.com.tangochou.fragment;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import d3vel0pper.com.tangochou.R;
import d3vel0pper.com.tangochou.addapter.CardListAdapter;
import d3vel0pper.com.tangochou.activity.MainActivity;
import d3vel0pper.com.tangochou.activity.VPActivity;
import d3vel0pper.com.tangochou.commons.ListData;

/**
 * Created by taka-dhu on 2015/12/09.
 */
public class WordCardListFragment extends Fragment {

    private Activity parent;
    private ListView listview;
    private Context context;
    private static String[] teststr = {"Hoge","foo","hogehoge","Foo"};

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){

        View v = inflater.inflate(R.layout.wordcardlistfragment,null);
        this.context = getActivity();
        listview = (ListView)v.findViewById(R.id.cardList);
        CardListAdapter adapter = new CardListAdapter(this.context,teststr);
        listview.setAdapter(adapter);


        listview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener(){
            @Override
        public boolean onItemLongClick(AdapterView<?> parent,View view,int position,long id){
                ListView listView = (ListView)parent;
                String item = (String)listView.getItemAtPosition(position);

                //add for giving ListView in Dialog
                String[] dialog_items = {"Title","Edit","Delete"};
                LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
                View Dialogview = layoutInflater.inflate(R.layout.dialog_layout,(ListView)view.findViewById(R.id.dialog_container));
                ListView lv = (ListView)Dialogview.findViewById(R.id.dialog_container);
                CardListAdapter dialogAdapter = new CardListAdapter(context,dialog_items);
                lv.setAdapter(dialogAdapter);

                new AlertDialog.Builder(getActivity())
                        .setView(Dialogview).setPositiveButton("Close",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                }).show();
                //onClick will available if this value is false.
                return true;
            }
        });

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            //selected
            @Override
            public void onItemClick(AdapterView<?> parent,View view,int position, long id){
                ListView listView = (ListView)parent;
                String item = (String)listView.getItemAtPosition(position);
                Activity activity = getActivity();
                Intent intent = new Intent(activity,VPActivity.class);
                startActivity(intent);
            }
        });


        return v;
    }

}
