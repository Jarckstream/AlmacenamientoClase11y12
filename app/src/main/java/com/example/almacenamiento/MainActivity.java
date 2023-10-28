package com.example.almacenamiento;

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

    public void Shared(View view){
        Intent i = new Intent(this, shared.class);
        startActivity(i);
    }

    public void Agenda (View view){
        Intent i = new Intent(this, agenda.class);
        startActivity(i);
    }

    public void Notas (View view){
        Intent i = new Intent(this, block.class);
        startActivity(i);
    }

    public void Nombre(View view){
        Intent i = new Intent(this, nombre1.class);
        startActivity(i);
    }
}