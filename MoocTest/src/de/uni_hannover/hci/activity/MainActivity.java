package de.uni_hannover.hci.activity;

import com.example.mooctest.R;

import de.uni_hannover.hci.data.LinkStore;
import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {

	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinkStore.init();
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void startTest(View view) {
    	Intent startTest = new Intent(this, StartTest.class);
    	
    	//Platznummer
    	EditText editText = (EditText) findViewById(R.id.editText1);
    	Editable placeNumber = editText.getText();
    //	if(placeNumber.length() == 2 && isNumber(placeNumber.charAt(0)) && isNumber(placeNumber.charAt(1))) {
    		//Start des Tests
        startActivity(startTest);
    //	} else {
    		//TODO
    		//Popup
    //	}
    	
    }
    
    public Boolean isNumber(char c) {
    	switch ( c ) {
    	case 0: return true;
    	case 1: return true;
    	case 2: return true;
    	case 3: return true;
    	case 4: return true;
    	case 5: return true;
    	case 6: return true;
    	case 7: return true;
    	case 8: return true;
    	case 9: return true;
    	}
    	return false;
    }
    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.main, container, false);
            return rootView;
        }
    }

}
