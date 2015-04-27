package com.example.mselab2;

import org.apache.http.protocol.HTTP;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.Button;

public class MainActivity extends Activity {

	Button button1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		button1 = (Button) findViewById(R.id.share);
		
		Intent intent = new Intent();
		
		intent.setAction(Intent.ACTION_SEND);
		String message = "This is Demo";
		intent.putExtra(Intent.EXTRA_TEXT, message);
		intent.setType(HTTP.PLAIN_TEXT_TYPE);
		
		String title = getResources().getString(R.string.Choose);
		Intent chooser = Intent.createChooser(intent, title);

		// Verify the intent will resolve to at least one activity
		if (intent.resolveActivity(getPackageManager()) != null) {
		    startActivity(intent);
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
