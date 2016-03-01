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

    private ViewPager viewPager = null;
    private Activity parent = getActivity();
    private List<ListData> list;

    private List<ListData> DataCreate(){
        List<ListData> res = new ArrayList<ListData>();

        res.add(new ListData("Foo1","hoge1"));
        res.add(new ListData("Foo2","hoge2"));
        res.add(new ListData("Foo3","hoge3"));

        return res;
    }

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
                Intent intent = new Intent(parent, VPActivity.class);
                startActivity(intent);
            }
        });
        /*
        this.viewPager = (ViewPager)v.findViewById(R.id.viewPager);
        PagerAdapter pagerAdapter = new CardPagerAdapter(parent,list);
        this.viewPager.setOnPageChangeListener(new PageChangeListener());
        this.viewPager.setAdapter(pagerAdapter);
        */
        return v;
    }

    class PageChangeListener extends ViewPager.SimpleOnPageChangeListener {
        @Override
        public void onPageSelected(int position){

        }
    }

}
