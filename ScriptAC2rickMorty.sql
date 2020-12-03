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

create table usuario(
usuario_id            int auto_increment primary key,
usuario_nome          varchar(80),
usuario_login         varchar(80),
usuario_senha         varchar(80)
);

insert into cadastroprodutos (produto_id,produto_nome,produto_quantidade,produto_preco,produto_tipo) values (null,'Camiseta de frases Cor preta',4,47.90,'camiseta');
insert into cadastroprodutos (produto_id,produto_nome,produto_quantidade,produto_preco,produto_tipo) values (null,'Caneca porcelana Rick ilustração',5,32.50,'caneca');
insert into cadastroprodutos (produto_id,produto_nome,produto_quantidade,produto_preco,produto_tipo) values (null,'Chinelo slide Rick picles',6,52.42,'chinelo');
insert into cadastroprodutos (produto_id,produto_nome,produto_quantidade,produto_preco,produto_tipo) values (null,'Funko POP portal gun',10,106.30,'brinquedo');
insert into cadastroprodutos (produto_id,produto_nome,produto_quantidade,produto_preco,produto_tipo) values (null,'Quadro decorativo',3,40.00,'quadro');
insert into cadastroprodutos (produto_id,produto_nome,produto_quantidade,produto_preco,produto_tipo) values (null,'Short de picles do Rick',2,80.25,'shorts');