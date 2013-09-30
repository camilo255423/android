package com.example.linux2;

import java.util.Date;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Chronometer;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
	DatePicker dp;
	Chronometer c;
	EditText caja1;
	EditText caja2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.principal);
        dp = (DatePicker) this.findViewById(R.id.datePicker1);
         c = (Chronometer) this.findViewById(R.id.cron);
        caja1 = (EditText) this.findViewById(R.id.caja1);
        caja2 = (EditText) this.findViewById(R.id.caja2);
      
        
        
    }
   public void click (View view)
   {
	   //c.start();
	  // Log.v("salida", dp.getMonth()+" "+dp.getYear());
	 //  int x = Integer.parseInt(this.caja1.getText().toString());
	  // int y = Integer.parseInt(this.caja2.getText().toString());
	  // x = x + y;
	   Date d = new Date();
	   caja2.setText(d.toString());
	   
   }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
