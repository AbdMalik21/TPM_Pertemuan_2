package com.example.acer.tugastpm2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tampil extends AppCompatActivity {
    private TextView tvname;
    private Button btnkalku;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil);

        tvname = findViewById(R.id.tvnama);
        btnkalku = findViewById(R.id.btnkalkulator);

        String nama = getIntent().getStringExtra("nama");
        String tampil = "Hi " + nama + "!";
        tvname.setText(tampil);

        btnkalku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(Tampil.this, Kalkulator.class);
                startActivity(pindah);
            }
        });
    }
}
