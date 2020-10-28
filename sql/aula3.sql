create database joins;
use joins;

#drop table enderecos;
create table enderecos (
	id int not null,
    endereco text,
    primary key (id)
);

#drop table clientes;
create table clientes (
	id int not null,
    nome varchar(100),
    primary key (id)
);

insert into clientes values
		(1, "João Marcio"),
        (2, "Juliana"),
        (3, "João Marcio"),
        (4, "Gabriela"),
        (6, "Fabio"),  
        (7, "Juliana");

INSERT INTO enderecos VALUES
	(1, 'Rua Faria lima, Centro, São Paulo'),
    (2, 'Rua Osvaldo Cruz,Campinas, São Paulo'),
    (3, 'Rua Rosana, Sinara, Nova Esperança'),
    (4, 'Av. Bias Fortes, Centro, Brasília'),
    (5, 'Beatles, Santa Cruz, Rio de Janeiro'),
    (6, 'Av. Esquerda, Vila Pinheiro, New York');

select * from clientes
inner join enderecos on clientes.id = enderecos.id;

select * from clientes
left join enderecos on clientes.id = enderecos.id;

select * from clientes
right join enderecos on clientes.id = enderecos.id;

create table clientes_copia select * from clientes;
create table enderecos_copia select * from enderecos;
create table inner_copia
select clientes.id as id_cliente, nome, clientes.id as id_endereco, endereco from clientes
	inner join enderecos on clientes.id = enderecos.id;

select * from enderecos;
select * from clientes;

select * from inner_copia;