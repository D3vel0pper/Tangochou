package d3vel0pper.com.tangochou.addapter;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import d3vel0pper.com.tangochou.fragment.Fragment2;
import d3vel0pper.com.tangochou.fragment.Testfragment;

/**
 * Created by taka-dhu on 2016/03/01.
 */
public class CustomPagerAdapter extends FragmentPagerAdapter {
    public CustomPagerAdapter(android.support.v4.app.FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int position){
        switch(position){
            case 0:
                return new Testfragment();
            case 1:
                return new Fragment2();
        }
        return null;
    }

    @Override
    public int getCount(){
        return 2;
    }

}
