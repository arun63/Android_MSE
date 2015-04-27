package com.example.mselab1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	TextView email,pass;
	Button submit;
	Intent intent1;
	private int buttoncount=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		email = (TextView) findViewById(R.id.email);
		pass = (TextView) findViewById(R.id.password);
		submit = (Button) findViewById(R.id.submit);
		submit.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			//	intent1 = new Intent(MainActivity.this,NextPage.class);
			//	startActivity(intent1);
				submit.setText("change");
				Toast.makeText(getApplicationContext(), "Button has Changed", Toast.LENGTH_LONG).show();
				buttoncount++;
				if(buttoncount >=2)
				{
					intent1 = new Intent(MainActivity.this,NextPage.class);
					startActivity(intent1);
				}
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
