create database Ford;
drop database Ford;
show databases;
use aula1;
create table funcionarios (
	nome varchar(30),
    idade tinyint,
    sexo char(1),
    peso float,
    altura float,
    nacionalidade varchar(20)
);
insert into funcionarios values
	("Juliana", 19, "f", 60, 1.65, "Brasileira"),
	("Gabriel", 22, "m", 67, 1.72, "Brasileira"),
	("Marcio", 27, "m", 85, 1.88, "Brasileira");

insert into funcionarios (nome)
values ("Márcio");

select * from funcionarios;

update funcionarios set nacionalidade="Argentino" where nome="Gabriel";

show tables;
describe funcionarios;
select * from funcionarios;