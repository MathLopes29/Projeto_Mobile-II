package com.example.transition_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout tela01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tela01 = findViewById(R.id.tela01);
    }

    public void T1seguir(View view) {
        Intent intent = new Intent(MainActivity.this, tela02.class);
        startActivity(intent);
    }

    public void mudarT1red(View view) {
        tela01.setBackgroundColor(getResources().getColor(R.color.red));
    }

    public void mudarT1green(View view) {
        tela01.setBackgroundColor(getResources().getColor(R.color.green));
    }

    public void mudarT1blue(View view) {
        tela01.setBackgroundColor(getResources().getColor(R.color.blue));
    }

    public void trocarCorAleatoriaT1(View view) {
        int[] cores = {R.color.red, R.color.blue, R.color.green, R.color.yellow, R.color.purple, R.color.orange};
        int corAleatoria = cores[(int) (Math.random() * cores.length)];
        tela01.setBackgroundColor(getResources().getColor(corAleatoria));
    }
}
