package com.example.sas_livraria_ds3m.remote;

import com.example.sas_livraria_ds3m.model.Cliente;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

//essa interface vai cuidar das rotas, descevendo como a relação com a API vai acontecer
public interface RouterInterface
{
    //ROTA DE INSERÇÃO DE USUARIO
        @POST("/cliente/cadastrarCliente")//rota da req e o verbo http
        Call<Cliente> addCliente(@Body Cliente objCliente);

}
