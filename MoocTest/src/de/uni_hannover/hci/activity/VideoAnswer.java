package de.uni_hannover.hci.activity;

import com.example.mooctest.R;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.ErrorReason;
import com.google.android.youtube.player.YouTubePlayer.OnInitializedListener;
import com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;

import de.uni_hannover.hci.data.DeveloperKey;
import de.uni_hannover.hci.data.LinkStore;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class VideoAnswer extends YouTubeBaseActivity implements
		OnInitializedListener, PlayerStateChangeListener {

	private YouTubePlayer player;
	private YouTubePlayerView youTubeView;
	private int message;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.video);

		Intent intent = getIntent();
		message = intent.getIntExtra(MainActivity.EXTRA_MESSAGE, 0 );
		this.setTitle("L�sung f�r Quiz "+message);
		
		youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_view);
		youTubeView.initialize(DeveloperKey.DEVELOPER_KEY, this);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.video, menu);
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

	public void nextActivity(View view) {
		Intent next = new Intent(this, Video.class);
		next.putExtra(MainActivity.EXTRA_MESSAGE, message+1);
		startActivity(next);		
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
			View rootView = inflater.inflate(R.layout.video,
					container, false);
			return rootView;
		}
	}

	@Override
	public void onInitializationSuccess(YouTubePlayer.Provider provider,
			YouTubePlayer player, boolean wasRestored) {
		if (!wasRestored) {
			this.player = player;
			this.player.setPlayerStateChangeListener(this);
			player.cueVideo(LinkStore.getVideo(message));
		}
	}

	protected YouTubePlayer.Provider getYouTubePlayerProvider() {
		return (YouTubePlayerView) findViewById(R.id.youtube_view);
	}

	@Override
	public void onInitializationFailure(Provider arg0,
			YouTubeInitializationResult arg1) {
		// TODO Auto-generated method stub
		System.out.println("Error");
	}

	@Override
	public void onAdStarted() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onError(ErrorReason arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onLoaded(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onLoading() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onVideoEnded() {
		nextActivity(null);
	}

	@Override
	public void onVideoStarted() {
		// TODO Auto-generated method stub

	}

}
