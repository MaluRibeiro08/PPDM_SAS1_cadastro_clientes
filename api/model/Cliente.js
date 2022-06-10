/* IMPORTA O MÓDULO DO sequelize */
const Sequelize = require('sequelize');

/* IMPORTA O ARQUIVO DE CONEXÃO COM BANCO DE DADOS */
const connection = require('../database/database');

const Cliente  = connection.define
(
    'tbl_cliente',
    {
        id_cliente:
        {
            type: Sequelize.INTEGER(10),
            primaryKey: true,
            autoIncrement: true
        },
        nome_cliente:
        {
            type: Sequelize.STRING(20),
            allowNull: false
        },
        sobrenome_cliente:
        {
            type: Sequelize.STRING(40),
            allowNull: false
        },
        celular_cliente:
        {
            type: Sequelize.STRING(20),
            allowNull: true
        },
        email_cliente:
        {
            type: Sequelize.STRING(300),
            allowNull: true
        }
    }
);


//Cliente.sync({force:true});//tenta sincronizar com a base de dados, e, no caso do force true, cria a tabela dnv toda vez que rodar

module.exports = Cliente;