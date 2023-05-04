package com.maxescobar.usointent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SegundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
    }

    //Metodo para el Boton Atras
    public void btnAtras(View vista){
        //Creamos un Intent
        Intent atras = new Intent(this, MainActivity.class);
        //Iniciamos el activity "atras"
        startActivity(atras);
    }
}