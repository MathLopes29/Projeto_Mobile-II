package com.example.transition_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class tela03 extends AppCompatActivity {
private LinearLayout tela03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela03);
        tela03 = findViewById(R.id.tela03);
    }

    public void mudarT3red(View view) {
        LinearLayout tela03 = findViewById(R.id.tela03);
        tela03.setBackgroundColor(getResources().getColor(R.color.red));
    }

    public void mudarT3green(View view) {
        LinearLayout tela03 = findViewById(R.id.tela03);
        tela03.setBackgroundColor(getResources().getColor(R.color.green));
    }

    public void mudarT3blue(View view) {
        LinearLayout tela03 = findViewById(R.id.tela03);
        tela03.setBackgroundColor(getResources().getColor(R.color.blue));
    }

    public void trocarCorAleatoriaT3(View view) {
        int[] cores = {R.color.red, R.color.blue, R.color.green, R.color.yellow, R.color.purple, R.color.orange};
        int corAleatoria = cores[(int) (Math.random() * cores.length)];
        tela03.setBackgroundColor(getResources().getColor(corAleatoria));
    }

    public void T3voltar(View view) {
        Intent intent = new Intent(tela03.this, tela02.class);
        startActivity(intent);
    }

    public void T3seguir(View view) {
        Intent intent = new Intent(tela03.this, tela04.class);
        startActivity(intent);
    }
}