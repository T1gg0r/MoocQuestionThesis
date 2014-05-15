package de.uni_hannover.hci.quiz;

import com.example.mooctest.R;

import de.uni_hannover.hci.activity.MainActivity;
import de.uni_hannover.hci.activity.VideoAnswer;
import de.uni_hannover.hci.data.DataStore;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public abstract class QuizAbstract extends ActionBarActivity {
	
	
	int message;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quiz3);

		Intent intent = getIntent();
		message = intent.getIntExtra(MainActivity.EXTRA_MESSAGE, 0 );
		this.setTitle("Quiz "+message);
	}
	
	public void nextActivity(View view) {
		Intent next = new Intent(this, VideoAnswer.class);
		next.putExtra(MainActivity.EXTRA_MESSAGE, message);
		startActivity(next);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			DataStore.printData();
			return true;
		}
		return super.onOptionsItemSelected(item);
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
			View rootView = inflater.inflate(R.layout.quiz3, container,
					false);
			return rootView;
		}
	}

}
