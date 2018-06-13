package com.example.cesarfuentes.sw1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void inicio(View v){
        Intent ListSong = new Intent(getApplicationContext(), inicio.class);
        startActivity(ListSong);
        Toast.makeText(this,"hola",Toast.LENGTH_LONG).show();
    }
    public void camara(View v){
        Intent ListSong = new Intent(getApplicationContext(), camara.class);
        startActivity(ListSong);
        Toast.makeText(this,"hola",Toast.LENGTH_LONG).show();
    }

}
