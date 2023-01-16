package com.team.laboratorio12ltm_fonseca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class BuscarLugar extends AppCompatActivity {

    private EditText et1,et2,et3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_lugar);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        et3=(EditText)findViewById(R.id.et3);
    }




    public void buscar(View v){
        Intent i = new Intent(this,MapsActivity.class);
        i.putExtra("titulo", et1.getText().toString());
        i.putExtra("lat", Double.parseDouble(et2.getText().toString()));
        i.putExtra("lng", Double.parseDouble(et3.getText().toString()));
        startActivity(i);
    }

}