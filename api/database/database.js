const Sequelize = require('sequelize');

//cria "connection" - instância da conexao com o banco de dados
const connection = new Sequelize('db_livraria_sas_ds3m', 'root', '12345678', {
    host: 'localhost',
    dialect: 'mysql',
    timezone: '-03:00'
});

//disponibiliza a conexao para os outros arquivos
module.exports = connection;