package d3vel0pper.com.tangochou.fragment;

import android.app.Activity;
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
import android.widget.Button;
import android.widget.FrameLayout;

import java.util.ArrayList;
import java.util.List;

import d3vel0pper.com.tangochou.R;
//import d3vel0pper.com.tangochou.addapter.CardPagerAdapter;
import d3vel0pper.com.tangochou.activity.MainActivity;
import d3vel0pper.com.tangochou.activity.VPActivity;
import d3vel0pper.com.tangochou.commons.ListData;

/**
 * Created by taka-dhu on 2015/12/09.
 */
public class WordCardListFragment extends Fragment {

    private Activity parent;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
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
        return v;
    }

    class PageChangeListener extends ViewPager.SimpleOnPageChangeListener {
        @Override
        public void onPageSelected(int position){

        }
    }

}
