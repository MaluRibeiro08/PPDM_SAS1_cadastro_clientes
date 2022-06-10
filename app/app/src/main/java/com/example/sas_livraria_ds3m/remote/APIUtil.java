package com.example.sas_livraria_ds3m.remote;
//implementa tudo RETROFIT CLIENT E ROUTER INTERFACE


public class APIUtil //faz as coisas funcionarem, integrando tudo que foi feito até aqui para que a API seja conhecida, bem como suas rotas
{
    private static final String API_URL = "http://10.107.144.4:3000/";
        //onde seria "localhost", colocamos o IP da máquina onde roda a API.
        // No postaman, um app conversa com seu própio Sistema Operacional. No caso do android ele conversa com outra máquina, outro SO. Cada um deles tem um IP e um localhost
        // é estatic p/ eu usar sempre que quiser sem instanciar objeto e o FINAL é pra não mudar nunca



    public static RouterInterface getAPIInterface()
    {//devolve o routerInterface para que o retrofit possa usá-lo.

        return RetrofitClient.getClient(API_URL).create(RouterInterface.class);
            //chamamos o método getClient e passamos pra ele a url, agora ele sabe onde bater, se conectou com a API
            //aí a gente pede pra ele criar a RouterInterface, que conta p/ ele as rotas e os verbos http
    }

}
