package de.uni_hannover.hci.quiz;

import com.example.mooctest.R;

import android.view.View;
import android.widget.Button;

public class Quiz6 extends QuizAbstract {

	public void selectAnswer(View view) {
		//RadioButton answer = (RadioButton) view;
		Button btn_next = (Button) findViewById(R.id.btn_nxt);
		btn_next.setVisibility(0);
		btn_next.setClickable(true);
	}
}
