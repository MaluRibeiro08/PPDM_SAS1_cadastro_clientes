package com.example.sas_livraria_ds3m.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sas_livraria_ds3m.R;
import com.example.sas_livraria_ds3m.model.Cliente;
import com.example.sas_livraria_ds3m.remote.APIUtil;
import com.example.sas_livraria_ds3m.remote.RouterInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CadastroClienteActivity extends AppCompatActivity {
    EditText et_nome_cliente;
    EditText et_sobrenome_cliente;
    EditText et_email_cliente;
    EditText et_celular_cliente;
    Button btn_cadastrar_cliente;
    RouterInterface routerInterface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);


        btn_cadastrar_cliente = findViewById(R.id.btn_cadastrar_cliente);
        et_nome_cliente = findViewById(R.id.et_nome_cliente);
        et_sobrenome_cliente = findViewById(R.id.et_sobrenome_cliente);
        et_email_cliente = findViewById(R.id.et_email_cliente);
        et_celular_cliente = findViewById(R.id.et_celular_cliente);


        btn_cadastrar_cliente.setOnClickListener(
            view ->
            {
                //PEGANDO OS DADOS
                    Cliente cliente = new Cliente();

                    cliente.setNome_cliente(et_nome_cliente.getText().toString());
                    cliente.setSobrenome_cliente(et_sobrenome_cliente.getText().toString());
                    cliente.setEmail_cliente(et_email_cliente.getText().toString());
                    cliente.setCelular_cliente(et_celular_cliente.getText().toString());

                //PASSANDO OS DADOS PARA A APIREST
                    routerInterface = APIUtil.getAPIInterface(); //conexão com a API, passsa a API para o client
                    addCliente(cliente);//os dados para a requisição ser feita
            }
        );
    }

    public void addCliente (Cliente cliente)
    {
        Call<Cliente> call = routerInterface.addCliente(cliente);

        call.enqueue //metodo que chama outro, ou seja, um callback
        (
            new Callback<Cliente>()
            {
                //não tem req pq o body e seus dados são passados automaticamente
                @Override
                public void onResponse(Call<Cliente> call, Response<Cliente> response)
                {
                    Log.d("CADASTRO_CLIENTE", "onResponse: RETORNOU RESPONSE");
                    if (response.isSuccessful())
                    {
                        Toast.makeText(CadastroClienteActivity.this, "Usuário cadastrado com sucesso :)", Toast.LENGTH_LONG).show();
                        Log.d("CADASTRO_CLIENTE", "onResponse: RETORNOU RESPONSE DE SUCESSO");

                        Intent intent = new Intent(CadastroClienteActivity.this, HomeCliente.class);
                        intent.putExtra("nome_cliente", cliente.getNome_cliente());
                        startActivity(intent);
                        finish();
                    }
                    else
                    {
                        Toast.makeText(CadastroClienteActivity.this, "Não foi possível cadastrar usuário :(", Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(Call<Cliente> call, Throwable t)
                {
                    Toast.makeText(CadastroClienteActivity.this, "Não foi possível cadastrar usuário :(", Toast.LENGTH_SHORT).show();
                    Log.d("CADASTRO_CLIENTE", "FALHOU: " + t.getMessage());
                }
            }
        );

    }
}