package d3vel0pper.com.tangochou.addapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import android.widget.ArrayAdapter;

import d3vel0pper.com.tangochou.R;

/**
 * Created by taka-dhu on 2015/12/15.
 */
public class CardListAddapter extends ArrayAdapter<String> {
    private final Context mContext;
    private final String[] mValues;

    public CardListAddapter(Context context, String[] values){
        super(context, R.layout.config_items,values);
        this.mContext = context;
        this.mValues = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.wordcard_item_list,parent,false);
        TextView itemText = (TextView) view.findViewById(R.id.CarditemText);
        itemText.setText(mValues[position]);

        return view;
    }

}
