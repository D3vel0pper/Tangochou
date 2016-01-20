package d3vel0pper.com.tangochou.addapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.ResourceBundle;

/**
 * Created by taka-dhu on 2016/01/20.
 */
public class CustomPagerAdapter extends PagerAdapter{
    private Context mContext;
    private ArrayList<Integer> mList;

    public CustomPagerAdapter(Context context) {
        mContext = context;
        mList = new ArrayList<Integer>();
    }

    /**
     * Add Items to the list
     * */
     public void add(Integer item){
         mList.add(item);
     }

    @Override
    public Object instantiateItem(ViewGroup container,int position) {
        //Get from the list
        Integer item = mList.get(position);

        //Create View
        TextView textView = new TextView(mContext);
        textView.setText(("page:" + position));
        textView.setTextSize(30);
        textView.setTextColor(item);
        textView.setGravity(Gravity.CENTER);

        //Add to a container
        container.addView(textView);

        return textView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
        container.removeView((View)object);
    }

    @Override
    public int getCount(){
        return mList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object){
        //return view == (TextView) object;
        return view.equals((TextView) object);
    }

}
