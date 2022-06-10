package com.example.sas_livraria_ds3m.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.sas_livraria_ds3m.R;
import com.example.sas_livraria_ds3m.ui.CadastroClienteActivity;

public class MainActivity extends AppCompatActivity {

    TextView btn_cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_cadastrar = findViewById(R.id.btn_cadastrar);

        btn_cadastrar.setOnClickListener(view ->
        {
            startActivity(new Intent(getApplicationContext(), CadastroClienteActivity.class));
        });
    }
}