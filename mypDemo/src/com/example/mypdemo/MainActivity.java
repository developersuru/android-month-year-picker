package com.example.mypdemo;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.suru.myp.MonthYearPicker;

public class MainActivity extends Activity {

	private TextView textView1;
	private MonthYearPicker myp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		textView1 = (TextView) findViewById(R.id.textView1);
		myp = new MonthYearPicker(this);
		myp.build(new OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				textView1.setText(myp.getSelectedMonthName() + " >> " + myp.getSelectedYear());
			}
		}, null);
	}

	public void show(View view) {
		myp.show();
	}

}
