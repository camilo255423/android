package com.example.l3;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends Activity {
EditText caja;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity2);
		caja = (EditText) this.findViewById(R.id.caja);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity2, menu);
		return true;
	}
	
	public void metodo (View v)
	{
	 Intent i = new Intent();
	 i.putExtra("caja", this.caja.getText().toString());
	 this.setResult(0, i);
	 this.finish();	
	}

}
