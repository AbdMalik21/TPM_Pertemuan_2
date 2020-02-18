package com.example.acer.tugastpm2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    private EditText etname;
    private Button btnstart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etname = findViewById(R.id.et_name);
        btnstart = findViewById(R.id.btn_name);

        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = etname.getText().toString();
                Intent pindah = new Intent(Login.this, Tampil.class);
                pindah.putExtra("nama",nama);
                startActivity(pindah);
            }
        });
    }
}
