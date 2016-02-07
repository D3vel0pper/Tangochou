package d3vel0pper.com.tangochou.addapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import d3vel0pper.com.tangochou.R;
import d3vel0pper.com.tangochou.commons.ListData;

/**
 * Created by taka-dhu on 2016/02/07.
 */
public class CardPagerAdapter {
    LayoutInflater _inflater = null;
    List<ListData> list;
    private TextView text1;
    private TextView text2;

    public CardPagerAdapter(Context context,List<ListData> list){
        super();
        _inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.list = list;
    }

    @Override
    public Object instantiateItem(ViewGroup container,int position){
        LinearLayout layout = (LinearLayout)_inflater.inflate(R.layout.cardlayout,null);
        text1 = (TextView)layout.findViewById(R.id.cardText1);
        text2 = (TextView)layout.findViewById(R.id.cardText2);
        text1.setText(list.get(position).getText1());
        text2.setText(list.get(position).getText2());

        container.addView(layout);
        return layout;
    }

}
