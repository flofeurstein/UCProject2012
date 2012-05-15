package at.fhv.uc.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import at.fhv.uc.can.client.DataClient;

public class CanTestAndroidActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void startService(View view){
    	//R.string.canInfo;
    	TextView tv = (TextView) findViewById(R.id.canInfoTextView);
    	tv.append("\n");
    	
    	DataClient dcl = new DataClient(tv);
		dcl.startConnection();
    }
}