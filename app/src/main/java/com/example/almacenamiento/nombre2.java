package com.example.almacenamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class nombre2 extends AppCompatActivity {

    private TextView tv1, tv2;

    RatingBar ratingBar;

    Button calificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nombre2);

        tv1=findViewById(R.id.txt_bienvenido);
        String dato= getIntent().getStringExtra("Dato");
        tv1.setText("Bienvenido" + dato);
        ratingBar = findViewById(R.id.ratingBar);
        calificar = findViewById(R.id.btn_calificar);

        calificar.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick (View view){
                String s = String.valueOf(ratingBar.getRating());
                Toast.makeText(getApplicationContext(),"Start",Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void Menu (View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void Back(View view){
        Intent i = new Intent(this, nombre1.class);
        startActivity(i);
    }
}