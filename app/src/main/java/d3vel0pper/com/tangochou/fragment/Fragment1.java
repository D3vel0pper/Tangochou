package d3vel0pper.com.tangochou.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import d3vel0pper.com.tangochou.activity.MainActivity;
import d3vel0pper.com.tangochou.R;

/**
 * Created by taka-dhu on 2015/12/09.
 */
public class Fragment1 extends Fragment implements View.OnClickListener {

    private MainActivity parent;
    private TestFragment testfragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view =  inflater.inflate(R.layout.fragment1,container,false);
        Button moveBtn = (Button)view.findViewById(R.id.moveBtn);
        moveBtn.setOnClickListener(this);
        Button testBtn = (Button)view.findViewById(R.id.testBtn);
        testBtn.setOnClickListener(this);
        return view;
    }

    @Override
    public void onAttach(Activity activity){
        parent = (MainActivity) activity;
        super.onAttach(activity);
    }

    @Override
    public void onClick(View v){
        if(v.getId() == R.id.moveBtn){
            parent.move();
        } else if(v.getId() == R.id.testBtn){
            //fragment manage
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            if(this.testfragment == null){
                this.testfragment = new TestFragment();
            }
            fragmentTransaction.replace(R.id.container,this.testfragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            v.invalidate();
        }
    }

}
