drop database if exists banco_loja;
create database banco_loja;
use banco_loja;

create table cadastroclientes (
id    int   auto_increment primary key,
nome        varchar(80),
cpf         varchar(80),
endereco    varchar(80),
bairro      varchar(80),
cidade      varchar(80),
estado      varchar(80), 
cep         varchar(80),
celular     varchar(80),
email       varchar(80)
);

create table cadastroprodutos (
produto_id            int auto_increment primary key,
produto_nome          varchar(80),
produto_quantidade    varchar(80),
produto_preco         varchar(80),
produto_tipo          varchar(80)

);