package d3vel0pper.com.tangochou.activity;

import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import d3vel0pper.com.tangochou.R;
import d3vel0pper.com.tangochou.addapter.CustomPagerAdapter;
import d3vel0pper.com.tangochou.commons.ListData;

public class VPActivity extends ActionBarActivity {

    private ViewPager viewPager = null;
    private List<ListData> list;

    private List<ListData> DataCreate(){
        List<ListData> res = new ArrayList<ListData>();

        res.add(new ListData("Foo1","hoge1"));
        res.add(new ListData("Foo2","hoge2"));
        res.add(new ListData("Foo3","hoge3"));

        return res;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vp);
        //
        setViews();
        //
    }
    private void setViews(){
        FragmentManager manager = getSupportFragmentManager();
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager);
        CustomPagerAdapter adapter = new CustomPagerAdapter(manager);
        viewPager.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_v, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
