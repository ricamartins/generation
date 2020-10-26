begin;
insert into colaboradores (nome, nascimento, sexo, peso, altura) values
	("Jaqueline", "1998-02-03", "F", 58.5, 1.60);
#rollback;
commit;
select * from colaboradores;