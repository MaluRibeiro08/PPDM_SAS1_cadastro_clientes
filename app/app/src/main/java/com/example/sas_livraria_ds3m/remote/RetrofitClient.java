package com.example.sas_livraria_ds3m.remote;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static Retrofit retrofit = null;

    // ACESSO AO CLIENT
    public static Retrofit getClient(String url) {
        //devolve o retrofit instanciado, logo, retorna um cliente.

        Gson gsonCriado = new GsonBuilder().setLenient().create();

        if (retrofit == null) {

            retrofit = new Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create(gsonCriado)).build();

        }
        return retrofit;
    }
}
