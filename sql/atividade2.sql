#cria e usa database db_RH2
create database db_RH2;
use db_RH2;

#cria tabela cargos
create table tb_cargos (
	id int not null auto_increment,
    cargo varchar(30) not null,
    andar smallint not null,
    primary key (id)
); 

#cria tabela funcionarios
create table tb_funcionarios (
	id int not null auto_increment,
    nome varchar(40) not null,
    salario decimal(7,2),
    sexo enum("F", "M", "O"),
    cargo int not null,
    primary key (id),
    constraint fk_cargo foreign key (cargo) references tb_cargos (id)
);

#insere cargos
insert into tb_cargos (nome, andar) values
	("Analista de RH", 1),
    ("Publicitário", 2),
    ("Contador", 3),
    ("Programador", 4),
    ("Analista de dados", 5);

#insere funcionarios
insert into tb_funcionarios (nome, salario, sexo, cargo) values
	("Luciana", 1534.34, "F", 1),
	("Rodrigo", 1478.23, "M", 3),
	("Fabrício", 2421.32, "M", 2),
	("Cleiton", 3032.45, "M", 4),
	("Jennifer", 1034.34, "F", 1),
	("Suzana", 3032.45, "F", 4),
	("Milton", 2824.53, "M", 5),
	("Cláudia", 2021.32, "F", 2),
	("Bruna", 3224.53, "F", 5),
	("Carlos", 1478.23, "M", 3),
	("Jonas", 2021.32, "O", 2),
	("Cristiana", 1878.23, "F", 3),
	("Ana", 3532.45, "F", 4),
	("Gabriel", 1034.34, "M", 1),
	("Graziela", 3032.45, "F", 4);
    
#select que retorna os funcionários com o salário maior do que 2000.
select * from tb_funcionarios
where salario > 2000;

#select trazendo  os funcionários com salário entre 1000 e 2000.
select * from tb_funcionarios
where salario between 1000 and 2000;

#select  utilizando LIKE buscando os Funcionários com a letra C.
select * from tb_funcionarios
where nome like "C%";

#junta as duas tabelas com nome, cargo e salário, apenas para teste
select tb_funcionarios.nome as nome, tb_cargos.cargo as cargo, salario from tb_funcionarios
inner join tb_cargos
on tb_funcionarios.cargo = tb_cargos.id;

select * from tb_cargos;
ALTER TABLE tb_cargos change nome cargo varchar(30);