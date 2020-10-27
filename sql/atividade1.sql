create database db_rh;
use db_rh;

create table tb_funcionarios (
	id int auto_increment,
    nome varchar(20) not null,
    cpf varchar(14) not null unique,
    telefone varchar(14) not null,
    sexo enum("M", "F", "O"),
    salario decimal(7,2),
    primary key (id)
);

insert into tb_funcionarios (nome, cpf, telefone, sexo, salario) values
	("Juliana", "123.234.657-23", "(11)92364-3028", "F", 1923.12),
	("André", "873.235.236-12", "(21)93728-2537", "M", 2043.21),
	("Rosana", "235.434.124-73", "(21)98729-2839", "F", 5782.40),
	("Fernando", "124.735.245-54", "(19)93622-0227", "M", 1672.43),
	("Cristiano", "902.424.213-21", "(11)93282-2638", "M", 2435.23);

select * from tb_funcionarios where salario > 2000;
select * from tb_funcionarios where salario < 2000;

update tb_funcionarios set salario = 2043.21 where nome like "Juliana";

create table tb_colaboradores (
	id int auto_increment primary key,
    qtd int auto_increment,
    nome varchar(20) not null,
    cpf varchar(14) not null unique,
    telefone varchar(14) not null,
    sexo enum("M", "F", "O"),
    salario decimal(7,2)
);