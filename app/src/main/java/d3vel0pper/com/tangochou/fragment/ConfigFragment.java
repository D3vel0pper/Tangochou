package d3vel0pper.com.tangochou.fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import d3vel0pper.com.tangochou.R;
import d3vel0pper.com.tangochou.addapter.ConfigItemAddapter;

/**
 * Created by taka-dhu on 2015/12/09.
 */
public class ConfigFragment extends Fragment {
    ListView listView;
    Context context;
    private final static String[] configList = {"Toggle quiz", "Settings", "Contact", "Info"};
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        this.context = getActivity();
        View v = inflater.inflate(R.layout.configfragment,container,false);
        listView = (ListView)v.findViewById(R.id.Setting_List);
        //add onItemClicked
        ConfigItemAddapter adapter = new ConfigItemAddapter(context,configList);

        listView.setAdapter(adapter);

        return v;
    }
}
