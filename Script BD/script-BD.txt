create database if not exists bd_portfolio;
use bd_portfolio;

CREATE TABLE IF NOT EXISTS tb_projeto(
	idProjeto int not null auto_increment,
    titulo varchar (30) not null,
    descricao varchar(500) not null,
    primary key (idProjeto)
);

CREATE TABLE IF NOT EXISTS tb_imagem(
    id_Projeto int not null,
    nome varchar (30) not null,
    link varchar(300) not null,
    foreign key(id_Projeto) references tb_projeto(idProjeto)
);

CREATE TABLE IF NOT EXISTS tb_linguagem(
	id_Projeto int not null,
    nome varchar(20),
    foreign key(id_Projeto) references tb_projeto(idProjeto)
);
