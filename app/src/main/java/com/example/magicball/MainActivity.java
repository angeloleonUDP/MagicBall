package com.example.magicball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton Ball;
    private TextView respuesta;
    private String [] respuestaArray ={"Paola bigotitos","Angelo Gordito", "los 2 cochinitos"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referencia la imagen
        Ball= findViewById(R.id.btn);
        //referencia texto
        respuesta = findViewById(R.id.respuestavista);

        //proceso
        Ball.setOnClickListener(this);
        Toast.makeText(MainActivity.this, "Consulta tu suerte", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v){
        //creación metodo switch
        switch(v.getId()){
            case R.id.btn:

                int rand = new Random().nextInt(respuestaArray.length);
                respuesta.setText(respuestaArray[rand]);


                break;
        }
    }
}