package d3vel0pper.com.tangochou.fragment;

import android.app.Fragment;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.Display;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;

import d3vel0pper.com.tangochou.R;
import d3vel0pper.com.tangochou.addapter.ConfigItemAddapter;

/**
 * Created by taka-dhu on 2015/12/17.
 */
public class CardFragment extends Fragment {
    Context context;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.cardfragment,container,false);
        this.context = getActivity();

        //this code does not work. U must read and understand the Work of CardView
        /*
        LinearLayout linearLayout = (LinearLayout)view.findViewById(R.id.cardLinear);
        linearLayout.removeAllViews();

        LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //HorizontalScrollView cardScrollView = (HorizontalScrollView)layoutInflater.inflate(R.layout.card_layout,null);
        LinearLayout ll = (LinearLayout)layoutInflater.inflate(R.layout.card_layout,null);
        CardView cardView = (CardView)view.findViewById(R.id.CardView);
        TextView WordText = (TextView)ll.findViewById(R.id.WordText);
        WordText.setText("TestText");
        //cardView.setTag(0);
        //cardScrollView.addView(linearLayout,0);

        linearLayout.addView(linearLayout);
        */

        //test code

        LinearLayout cardLinear = (LinearLayout)view.findViewById(R.id.cardLinear);
        cardLinear.removeAllViews();
        //Get Display size
        int Displaywidth = 0;
        WindowManager wm = (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        Displaywidth = size.x - (size.x * 18 / 100);
        //Displaywidth = cardLinear.getWidth();

        for(int i = 0;i<5;i++){
            LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            LinearLayout linearLayout = (LinearLayout)layoutInflater.inflate(R.layout.card_layout,null);
            CardView cardView = (CardView)linearLayout.findViewById(R.id.CardView);
            /*
            TextView textView = (TextView)linearLayout.findViewById(R.id.WordText);
            textView.setText("CardView" + i);
            */
            TextView textView = new TextView(context);
            textView.setText("CardView" + i);
            textView.setGravity(Gravity.CENTER_HORIZONTAL);
            textView.setWidth(Displaywidth);
            textView.setTextSize(20);
            cardView.setTag(i);
            cardView.setOnClickListener(new View.OnClickListener(){
                @Override
            public void onClick(View v){
                    Toast.makeText(context,String.valueOf(v.getTag()) + "th Clicked",Toast.LENGTH_SHORT).show();
                }
            });
            RelativeLayout TextLinear = (RelativeLayout)linearLayout.findViewById(R.id.textLinear);
            TextLinear.addView(textView);
            cardLinear.addView(linearLayout,i);
        }


        return view;
    }
}
