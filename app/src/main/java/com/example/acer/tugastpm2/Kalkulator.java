package com.example.acer.tugastpm2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kalkulator extends AppCompatActivity {
    private EditText etnilai1,etnilai2;
    private Button btntambah,btnkurang,btnkali,btnbagi;
    private TextView tvhasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        etnilai1 = findViewById(R.id.etnilai1);
        etnilai2 = findViewById(R.id.etnilai2);
        tvhasil = findViewById(R.id.tvhasil);
        btntambah = findViewById(R.id.button1);
        btnkurang = findViewById(R.id.button2);
        btnkali = findViewById(R.id.button3);
        btnbagi = findViewById(R.id.button4);

        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a1 = etnilai1.getText().toString();
                String a2 = etnilai2.getText().toString();

                int ang1 = Integer.parseInt(a1);
                int ang2 = Integer.parseInt(a2);

                int hasil = ang1+ang2;
                String hsl = String.valueOf(hasil);
                tvhasil.setText(hsl);
            }
        });

        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a1 = etnilai1.getText().toString();
                String a2 = etnilai2.getText().toString();

                int ang1 = Integer.parseInt(a1);
                int ang2 = Integer.parseInt(a2);

                int hasil = ang1-ang2;
                String hsl = String.valueOf(hasil);
                tvhasil.setText(hsl);
            }
        });

        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a1 = etnilai1.getText().toString();
                String a2 = etnilai2.getText().toString();

                int ang1 = Integer.parseInt(a1);
                int ang2 = Integer.parseInt(a2);

                int hasil = ang1*ang2;
                String hsl = String.valueOf(hasil);
                tvhasil.setText(hsl);
            }
        });

        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a1 = etnilai1.getText().toString();
                String a2 = etnilai2.getText().toString();

                int ang1 = Integer.parseInt(a1);
                int ang2 = Integer.parseInt(a2);

                int hasil = ang1/ang2;
                String hsl = String.valueOf(hasil);
                tvhasil.setText(hsl);
            }
        });
    }
}
