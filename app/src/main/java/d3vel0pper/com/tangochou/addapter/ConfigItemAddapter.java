package d3vel0pper.com.tangochou.addapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import d3vel0pper.com.tangochou.R;

/**
 * Created by taka-dhu on 2015/12/15.
 */
public class ConfigItemAddapter extends ArrayAdapter<String> {
    private final Context mContext;
    private final String[] mValues;

    public ConfigItemAddapter(Context context, String[] values){
        super(context, R.layout.config_items,values);
        this.mContext = context;
        this.mValues = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.config_items,parent,false);
        ImageView itemImage = (ImageView)view.findViewById(R.id.itemImage);
        TextView itemText = (TextView) view.findViewById(R.id.itemText);
        itemText.setText(mValues[position]);

        //if u want to change icon based on name, u should remove under description and comment out from here
        itemImage.setImageResource(R.drawable.androidiconbase);
        /*
        String label = mValues[position];

        if(label.equals("")){
            itemImage.setImageResource(R.drawable.androidiconbase);
        } else if(label.equals("")){
            itemImage.setImageResource(R.drawable.androidiconbase);
        } else{
            itemImage.setImageResource(R.drawable.androidiconbase);
        }
        */

        return view;
    }

}
