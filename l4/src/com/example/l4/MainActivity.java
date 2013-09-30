package com.example.l4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
FileOutputStream fos;
FileInputStream fis;
String s;
TextView tv;
EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) this.findViewById(R.id.tv);
		 s=Environment.getExternalStorageDirectory().getPath()+"/documento.txt";
        et = (EditText) this.findViewById(R.id.et);
    	 /*
    	 String datax = "" ;
         try {
             FileInputStream fIn = openFileInput ( "archivo.txt" ) ;
             InputStreamReader isr = new InputStreamReader ( fIn ) ;
             BufferedReader buffreader = new BufferedReader ( isr ) ;

             String readString = buffreader.readLine ( ) ;
             while ( readString != null ) {
                 datax = datax + readString ;
                 readString = buffreader.readLine ( ) ;
             }
             
             isr.close ( ) ;
             
         } catch ( IOException ioe ) {
             ioe.printStackTrace ( ) ;
         }
         tv.setText("datos"+datax);
         */
     
        tv.setText("ruta"+s);
        this.leer(null);
     
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void guardar(View v)
    {
try {
			
			FileWriter fw =  new FileWriter(s,true);
			fw.append(et.getText().toString()+"\n");
			fw.flush();
			fw.close();
		    et.setText("");
		} catch (FileNotFoundException e) {
			Log.v("mensaje",e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			Log.v("mensaje",e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
    }
    public void leer(View v)
    {
    	try {
			FileReader file=new FileReader(s);
			BufferedReader bf = new BufferedReader(file);
			
			String z="",w;
			if((w= bf.readLine())!=null)
			{
				z=z+"\n"+w;
			}
			tv.setText(z);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
