/* IMPORTA O MÓDULO DO express */
const express = require('express');

/* IMPORTA O MODEL DE LIVRO */
const cliente = require('../model/Cliente');

/* CONFIGURA A FUNCIONALIDA DE ROTAS  */
const router = express.Router();


router.post('/cliente/cadastrarCliente', (req, res)=>{

    const { nome_cliente, sobrenome_cliente, email_cliente, celular_cliente } = req.body;

    console.log(req.body)

    if (req.body.nome_cliente != null && req.body.nome_cliente != '') 
    {
        cliente.create({
            nome_cliente, 
            sobrenome_cliente,
            celular_cliente,
            email_cliente
        }).then(
            ()=>{
               res.status(200).json({"Resultado": "Usuário cliente cadastrado com sucesso"});
            }
        );
    }
    else
    {
        console.log("teste")
        res.status(100).json({"Resultado": "Confira o envio dos dados"});
    }
    

});

module.exports = router;