package com.maxescobar.usointent;

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

    //Metodo para el Boton Siguiente
    public void btnSiguiente(View vista){
        //Creamos un Intent
        Intent siguiente = new Intent(this, SegundoActivity.class);
        //Iniciamos el activity "siguiente"
        startActivity(siguiente);
    }
}