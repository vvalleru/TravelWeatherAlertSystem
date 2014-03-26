package com.vishnuvalleru.travelweatheralertsystem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StartActivity extends Activity implements
		android.view.View.OnClickListener {
	EditText et1, et2;
	String from = "abc";
	String to = "xyz";
	Button b1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.start_screen);
		System.out.println("inside start activity");
		intialization();
		b1.setOnClickListener(this);
	}

	private void intialization() {
		et1 = (EditText) findViewById(R.id.fromValue);
		et2 = (EditText) findViewById(R.id.toValue);
		
		
		b1 = (Button) findViewById(R.id.okButton);
	}

	@Override
	public void onClick(View arg0) {
		if (arg0.getId() == R.id.okButton) {
			
			from = et1.getText().toString();
			to = et2.getText().toString();
			Bundle b = new Bundle();

			b.putString("from", from);
			b.putString("to", to);
			Intent i = new Intent(getApplicationContext(), MainActivity.class);
			i.putExtras(b);
			startActivity(i);
		}
	}

}
