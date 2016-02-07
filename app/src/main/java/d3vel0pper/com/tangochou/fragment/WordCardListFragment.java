package d3vel0pper.com.tangochou.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import d3vel0pper.com.tangochou.R;
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
        View v = inflater.inflate(R.layout.wordcardlistfragment,container,false);
        viewPager = (ViewPager)parent.findViewById(R.id.viewPager);
        PagerAdapter pagerAdapter = new CardPagerAdapter(this,list);
        viewPager.setOnPageChangeListener(new PagerChangeListener());
        viewPager.setAdapter(pagerAdapter);

        return v;
    }

    class PageChangeListener extends ViewPager.SimpleOnPageChangeListener {
        @Override
        public void onPageSelected(int position){

        }
    }
}
