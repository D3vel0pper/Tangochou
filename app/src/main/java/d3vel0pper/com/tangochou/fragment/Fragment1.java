package d3vel0pper.com.tangochou.fragment;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
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
    private ConfigFragment configfragment;
    private WordCardListFragment wordcardlistfragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view =  inflater.inflate(R.layout.fragment1,container,false);
       /*
        Button moveBtn = (Button)view.findViewById(R.id.moveBtn);
        moveBtn.setOnClickListener(this);
        Button testBtn = (Button)view.findViewById(R.id.testBtn);
        testBtn.setOnClickListener(this);
        */
        Button configBtn = (Button)view.findViewById(R.id.moveConfigBtn);
        configBtn.setOnClickListener(this);
        Button cardListBtn = (Button)view.findViewById(R.id.moveCardListBtn);
        cardListBtn.setOnClickListener(this);
        return view;
    }

    @Override
    public void onAttach(Activity activity){
        this.parent = (MainActivity) activity;
        super.onAttach(activity);
    }

    @Override
    public void onClick(View v){
        if(v.getId() == R.id.moveConfigBtn){
            //fragment manage
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            if(this.configfragment == null){
                this.configfragment = new ConfigFragment();
            }
            fragmentTransaction.replace(R.id.container,this.configfragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        } else if(v.getId() == R.id.moveCardListBtn){
            //fragment manage
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            if(this.wordcardlistfragment == null){
                this.wordcardlistfragment = new WordCardListFragment();
            }
            fragmentTransaction.replace(R.id.container, this.wordcardlistfragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }

    }


}
