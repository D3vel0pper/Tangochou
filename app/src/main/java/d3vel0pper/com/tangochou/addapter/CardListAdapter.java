package d3vel0pper.com.tangochou.addapter;

import android.app.ActionBar;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.view.ViewGroup.LayoutParams;

import d3vel0pper.com.tangochou.R;

/**
 * Created by taka-dhu on 2016/04/03.
 */
public class CardListAdapter extends ArrayAdapter<String> {
    private final Context mContext;
    private final String[] mValues;

    public CardListAdapter(Context context, String[] values){
        super(context, R.layout.config_items,values);
        this.mContext = context;
        this.mValues = values;
    }

    @Override
    public View getView(int position,View ConvertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.simple_text_item,parent,false);
        TextView itemText = (TextView)view.findViewById(R.id.ItemText);
        itemText.setText(mValues[position]);
        return view;
    }

}
