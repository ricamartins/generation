use test;

create table funcionarios (
	id int not null auto_increment,
    nome varchar(30) not null,
    nascimento date,
    sexo enum("M", "F"),
    peso decimal(5,2),
    altura decimal(3,2),
    nacionalidade varchar(20) default "Brasil",
    primary key (id)
) engine = InnoDB;

insert into funcionarios values
(default, "alex tenorio da silva", "2018-02-03", "M", 68.5, 2.05, default);

insert into funcionarios (nome, nascimento, sexo, peso, altura) values
	("gabriela", "1998-05-13", "F", 56.5, 1.68),
	("joão", "1994-04-24", "M", 78.7, 1.72),
	("marcio", "2002-12-27", "M", 82.1, 1.85);

select * from funcionarios;
select * from funcionarios where peso > 70;
select * from funcionarios;
select * from funcionarios;
select * from funcionarios;
select * from funcionarios;