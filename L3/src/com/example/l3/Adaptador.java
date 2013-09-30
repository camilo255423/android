package com.example.l3;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class Adaptador  extends ArrayAdapter<String>{
    Context context; 
    List<String> valores;
	public Adaptador(Context context, int resource, List<String> valores) {
		super(context, resource, valores);
		// TODO Auto-generated constructor stub
		this.context = context;
		this.valores = valores;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
	//	super.getView(position, convertView, parent);
		
		LayoutInflater li = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View fila = li.inflate(R.layout.item_layout, parent,false);
	    TextView tv = (TextView) fila.findViewById(R.id.dato);
	    tv.setText(valores.get(position));
	  return fila;
	}

}
