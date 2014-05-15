package de.uni_hannover.hci.quiz;

import com.example.mooctest.R;

import de.uni_hannover.hci.data.DataStore;
import de.uni_hannover.hci.data.DataTypes;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Quiz3 extends QuizAbstract {

	public void selectAnswer(View view) {
		RadioButton answer = (RadioButton) view;
		DataStore.setData(DataTypes.Q3,answer.getText().toString());
		Button btn_next = (Button) findViewById(R.id.btn_nxt);
		btn_next.setVisibility(0);
		btn_next.setClickable(true);
	}
}
