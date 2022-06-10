package com.example.sas_livraria_ds3m.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cliente
{
    @SerializedName("nome_cliente")
    @Expose
    private String nome_cliente;

    @SerializedName("sobrenome_cliente")
    @Expose
    private String sobrenome_cliente;

    @SerializedName("celular_cliente")
    @Expose
    private String celular_cliente;

    @SerializedName("email_cliente")
    @Expose
    private String email_cliente;


    public Cliente() { }

    public Cliente(String nome_cliente, String sobrenome_cliente, String celular_cliente, String email_cliente)
    {
        this.nome_cliente = nome_cliente;
        this.sobrenome_cliente = sobrenome_cliente;
        this.celular_cliente = celular_cliente;
        this.email_cliente = email_cliente;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getSobrenome_cliente() {
        return sobrenome_cliente;
    }

    public void setSobrenome_cliente(String sobrenome_cliente) {
        this.sobrenome_cliente = sobrenome_cliente;
    }

    public String getCelular_cliente() {
        return celular_cliente;
    }

    public void setCelular_cliente(String celular_cliente) {
        this.celular_cliente = celular_cliente;
    }

    public String getEmail_cliente() {
        return email_cliente;
    }

    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }
}
