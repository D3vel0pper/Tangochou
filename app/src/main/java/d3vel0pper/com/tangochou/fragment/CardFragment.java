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
 * Created by taka-dhu on 2015/12/17.
 */
public class CardFragment extends Fragment {
    Context context;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        this.context = getActivity();
        return v;
    }
}
