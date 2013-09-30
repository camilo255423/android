package com.example.l3;

import java.net.URI;
import java.util.ArrayList;

import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.animation.Animator;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.Toast;

public class MainActivity extends Activity implements OnItemSelectedListener{
    Animation anim;
    Button boton;
    TableLayout tabla;
    Spinner sp;
    ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = (ListView) this.findViewById(R.id.lista);
        ArrayList<String> valores = new ArrayList<String>();
        for(int i=0;i<=20;i++)
     valores.add("item"+i);
    
     Adaptador adaptador = new Adaptador(this,android.R.layout.simple_list_item_1,valores);
     lista.setAdapter(adaptador);

        
        
     /*   boton = (Button) this.findViewById(R.id.boton123);
        anim = AnimationUtils.loadAnimation(getApplicationContext(),
                R.animator.aparecer);
        tabla = (TableLayout) this.findViewById(R.id.tabla1);
        tabla.setVisibility(TableLayout.INVISIBLE);
        String c[]={"Bogotá","Cali","Medellín"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, c);
        
        
        sp=(Spinner) this.findViewById(R.id.sp1);
       sp.setAdapter(adapter); 
      sp.setOnItemSelectedListener(this);*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void metodo(View v)
    {
    	Uri uri;
    	uri = Uri.parse("ventana1://proyecto.com/ventana1");
    	/*Intent i = new Intent(Intent.ACTION_GET_CONTENT);
    	i.setType(ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE);
    	this.startActivityForResult(i,0);*/
    	Intent i = new Intent(Intent.ACTION_VIEW,uri);
    	this.startActivityForResult(i,0);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    	// TODO Auto-generated method stub
    	super.onActivityResult(requestCode, resultCode, data);
    	/*
    	String parametros[]={ContactsContract.CommonDataKinds.Phone.NUMBER, ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME};
    	Cursor cursor = this.getContentResolver().query(data.getData(), parametros,null,null,null);
    	cursor.moveToFirst();
    	
    	Toast toast = Toast.makeText(this, cursor.getString(0)+" "+cursor.getString(1), 4000);
    	toast.show();
    	*/
    	Toast toast = Toast.makeText(this, data.getStringExtra("caja"), 4000);
    	toast.show();
    }


	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		//String s[] = this.getResources().getStringArray(R.array.valores);
		String w = (String) sp.getSelectedItem();
		Toast t = Toast.makeText(this, w+"w", 2000);
		
		t.show();
		
	}


	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
}
