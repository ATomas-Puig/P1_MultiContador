package com.example.p1multicontador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.p1multicontador.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    int c1;
    int c2;
    int c3;
    int c4;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.botonContador1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c1++;
                binding.contador1.setText(String.valueOf(c1));
                binding.contadorTotal.setText(String.valueOf(c1+c2+c3+c4));
            }
        });
        binding.botonResetContador1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c1=0;
                binding.contador1.setText(String.valueOf(c1));
                binding.contadorTotal.setText(String.valueOf(c1+c2+c3+c4));
            }
        });
        binding.botonContador2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c2++;
                binding.contador2.setText(String.valueOf(c2));
                binding.contadorTotal.setText(String.valueOf(c1+c2+c3+c4));
            }
        });
        binding.botonResetContador2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c2=0;
                binding.contador2.setText(String.valueOf(c2));
                binding.contadorTotal.setText(String.valueOf(c1+c2+c3+c4));
            }
        });
        binding.botonContador3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c3++;
                binding.contador3.setText(String.valueOf(c3));
                binding.contadorTotal.setText(String.valueOf(c1+c2+c3+c4));
            }
        });
        binding.botonResetContador3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c3=0;
                binding.contador3.setText(String.valueOf(c3));
                binding.contadorTotal.setText(String.valueOf(c1+c2+c3+c4));
            }
        });
        binding.botonContador4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c4++;
                binding.contador4.setText(String.valueOf(c4));
                binding.contadorTotal.setText(String.valueOf(c1+c2+c3+c4));
            }
        });
        binding.botonResetContador4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c4=0;
                binding.contador4.setText(String.valueOf(c4));
                binding.contadorTotal.setText(String.valueOf(c1+c2+c3+c4));
            }
        });
        binding.botonResetAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c1 = 0;
                c2 = 0;
                c3 = 0;
                c4 = 0;
                binding.contador1.setText(String.valueOf(c1));
                binding.contador2.setText(String.valueOf(c2));
                binding.contador3.setText(String.valueOf(c3));
                binding.contador4.setText(String.valueOf(c4));
                binding.contadorTotal.setText(String.valueOf(c1+c2+c3+c4));

            }
        });


    }
}