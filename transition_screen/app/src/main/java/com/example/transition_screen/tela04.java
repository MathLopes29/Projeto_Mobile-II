package com.example.transition_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class tela04 extends AppCompatActivity {
    private LinearLayout tela04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela04);
        tela04 = findViewById(R.id.tela04);
    }

    public void mudarT4red(View view) {
        LinearLayout tela04 = findViewById(R.id.tela04);
        tela04.setBackgroundColor(getResources().getColor(R.color.red));
    }

    public void mudarT4green(View view) {
        LinearLayout tela04 = findViewById(R.id.tela04);
        tela04.setBackgroundColor(getResources().getColor(R.color.green));
    }

    public void mudarT4blue(View view) {
        LinearLayout tela04 = findViewById(R.id.tela04);
        tela04.setBackgroundColor(getResources().getColor(R.color.blue));
    }

    public void trocarCorAleatoriaT4(View view) {
        int[] cores = {R.color.red, R.color.blue, R.color.green, R.color.yellow, R.color.purple, R.color.orange};
        int corAleatoria = cores[(int) (Math.random() * cores.length)];
        tela04.setBackgroundColor(getResources().getColor(corAleatoria));
    }

    public void T4voltar(View view) {
        Intent intent = new Intent(tela04.this, tela03.class);
        startActivity(intent);
    }
}