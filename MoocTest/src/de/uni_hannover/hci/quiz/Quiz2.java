package de.uni_hannover.hci.quiz;

import com.example.mooctest.R;

import de.uni_hannover.hci.activity.MainActivity;
import de.uni_hannover.hci.activity.Video;
import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;

public class Quiz2 extends ActionBarActivity {

	int message;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quiz2);

		Intent intent = getIntent();
		message = intent.getIntExtra(MainActivity.EXTRA_MESSAGE, 0 );
	}

	public void selectAnswer(View view) {
		//RadioButton answer = (RadioButton) view;
		Button btn_next = (Button) findViewById(R.id.Q1btn_nxt);
		btn_next.setVisibility(0);
		btn_next.setClickable(true);
	}
	
	public void nextActivity(View view) {
		Intent next = new Intent(this, Video.class);
		next.putExtra(MainActivity.EXTRA_MESSAGE, message);
		startActivity(next);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.quiz, menu);
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

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.quiz2, container,
					false);
			return rootView;
		}
	}

}
