package com.curso.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

       public void geraTexto(View v){
           String[] frases = new String[]{"Você é viado?","Você dá o cu?","Vai beber PORRA","Vai comer alguém!!!","Você é torcedor do Vitória?"};
           TextView texto = findViewById(R.id.texto_Frase);
            int i = new Random().nextInt(5);
            texto.setText(frases[i]);


    }
    }
