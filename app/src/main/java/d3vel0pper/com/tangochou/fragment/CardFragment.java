package d3vel0pper.com.tangochou.fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

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
        View view = inflater.inflate(R.layout.cardfragment,container,false);
        this.context = getActivity();

        //read this article -> http://aims-to-freelance.hatenablog.jp/entry/2015/02/10/224122
        //this code does not work. U must read and understand the Work of CardView
        /*
        LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        HorizontalScrollView cardScrollView = (HorizontalScrollView)layoutInflater.inflate(R.layout.card_layout,null);
        TextView WordText = (TextView)view.findViewById(R.id.CarditemText);
        WordText.setText("TestText");
        //cardScrollView.addView();
        */
        return view;
    }
}
