package d3vel0pper.com.tangochou.activity;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import d3vel0pper.com.tangochou.R;
import d3vel0pper.com.tangochou.activity.SecondActivity;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void move(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.moveBtn:
                intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                break;
            case R.id.moveConfigBtn:
                intent = new Intent(this, ConfigActivity.class);
                startActivity(intent);
                break;
            case R.id.moveCardListBtn:
                intent = new Intent(this, WordCardListActivity.class);
                startActivity(intent);
                break;
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
