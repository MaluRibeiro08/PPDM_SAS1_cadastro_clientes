package com.example.sas_livraria_ds3m.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.sas_livraria_ds3m.R;

public class HomeCliente extends AppCompatActivity {

    TextView tv_saudacoes_home;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_cliente);

        tv_saudacoes_home = findViewById(R.id.tv_saudacoes_home);

        String nome_cliente = this.getIntent().getExtras().getString("nome_cliente");
        tv_saudacoes_home.setText("Olá, " + nome_cliente + "!");
    }
}