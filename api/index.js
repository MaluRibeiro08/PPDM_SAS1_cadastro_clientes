//EXPRESS
    //import
        const express = require('express');
    //instancia
        const app = express();
    //configuracoes
        app.use(express.json());
        app.use(express.urlencoded({ extended: true }));

//CLIENTE
    //Identificando/reconhecendo as rotas de cliente
        const clienteController = require('./controller/ClienteController');
        app.use('/', clienteController);


//SERVIDOR EXPRESS
    app.listen(3000, ()=>{ 
        console.log('SERVIDOR RODANDO NA URL: http://localhost:3000'); 
    });