package com.example.transition_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class tela02 extends AppCompatActivity {
    private LinearLayout tela02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela02);
        tela02 = findViewById(R.id.tela02);
    }


    public void mudarT2red(View view) {
        LinearLayout tela02 = findViewById(R.id.tela02);
        tela02.setBackgroundColor(getResources().getColor(R.color.red));
    }

    public void mudarT2green(View view) {
        LinearLayout tela02 = findViewById(R.id.tela02);
        tela02.setBackgroundColor(getResources().getColor(R.color.green));
    }

    public void mudarT2blue(View view) {
        LinearLayout tela02 = findViewById(R.id.tela02);
        tela02.setBackgroundColor(getResources().getColor(R.color.blue));
    }

    public void trocarCorAleatoriaT2(View view) {
        int[] cores = {R.color.red, R.color.blue, R.color.green, R.color.yellow, R.color.purple, R.color.orange};
        int corAleatoria = cores[(int) (Math.random() * cores.length)];
        tela02.setBackgroundColor(getResources().getColor(corAleatoria));
    }

    public void T2voltar(View view) {
        Intent intent = new Intent(tela02.this, MainActivity.class);
        startActivity(intent);
    }

    public void T2seguir(View view) {
        Intent intent = new Intent(tela02.this, tela03.class);
        startActivity(intent);
    }
}
