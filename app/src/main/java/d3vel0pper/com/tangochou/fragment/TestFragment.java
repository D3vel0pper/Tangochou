package d3vel0pper.com.tangochou.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import d3vel0pper.com.tangochou.R;

/**
 * Created by taka-dhu on 2015/12/10.
 */
public class TestFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.testfragment,container,false);
        return v;
    }
}
