package com.example.root.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface typeface=Typeface.createFromAsset(getAssets(),"OpenSans_Light.ttf");
        TextView textView= (TextView) findViewById(R.id.txt1);
        TextView textView1=(TextView) findViewById(R.id.events);
        textView.setTypeface(typeface);
        textView1.setTypeface(typeface);


    }
    public void doSomething(View v){

        if(v.getId()==R.id.image1){
       Intent i = new Intent(this,About_fusion.class);
       startActivity(i);
        }
        if(v.getId()==R.id.image2){
            Intent i2 = new Intent(this,about_us.class);
            startActivity(i2);
        }
        if(v.getId()==R.id.image3){
            Intent i2 = new Intent(this,tabtest.class);
            startActivity(i2);
        }
        if(v.getId()==R.id.image5){
            Intent i2 = new Intent(this,Visitweb.class);
            startActivity(i2);
        }

        if(v.getId()==R.id.image6){
            Intent i2 = new Intent(this,Web.class);
            startActivity(i2);
        }
        
    }
}
