package d3vel0pper.com.tangochou.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import d3vel0pper.com.tangochou.R;

/**
 * Created by taka-dhu on 2015/12/09.
 */
public class ConfigFragment extends Fragment {
    ListView listView;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.configfragment,container,false);
        listView = (ListView)v.findViewById(R.id.Setting_List);
        //add onItemClicked
        return v;
    }
}
