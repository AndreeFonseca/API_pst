package com.team.laboratorio12ltm_fonseca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void consultarUbicacion(View v){
        Intent i = new Intent(this,Ubicacion.class);
        startActivity(i);
    }

    public void lugar(View v){
        Intent i = new Intent(this,BuscarLugar.class);
        startActivity(i);
    }

}