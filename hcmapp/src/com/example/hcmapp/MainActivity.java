package com.example.hcmapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        
        button1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this, DiccionarioActivity.class);
               startActivity(intent);
            }
         });
        
        button2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this, MapsActivity.class);
               startActivity(intent);
            }
         });
    
    }


   
}
