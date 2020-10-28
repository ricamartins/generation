create database db_cidade_das_carnes;
use db_cidade_das_carnes;

create table tb_categorias (
	id int auto_increment not null,
    categoria varchar(40),
    qualidade enum("1", "2", "N"),
    primary key (id)
);

create table tb_produtos (
	id int auto_increment not null,
    nome varchar(40),
    estoque double,
    marca varchar(30),
    preco decimal(5,2),
    categoria int,
    primary key (id),
    foreign key (categoria) references tb_categorias (id)
);

insert into tb_categorias (categoria, qualidade) values
	("Bovina", "1"),
	("Suína", "1"),
	("Avina", "2"),
	("Pescado", "2"),
	("Acessório", "N");
    
insert into tb_produtos (nome, estoque, marca, preco, categoria) values
	("Filé Mignon", 346.33, "Sadia", 63.42, 1),
	("Alcatra", 153.22, "Friboi", 54.32, 1),
    ("Bacon", 75.34, "Swift", 18.54, 2),
    ("Linguiça", 254.23, "Friboi", 20.32, 2),
	("Asa de Frango", 536.23, "Seara", 17.64, 3),
	("Sardinha", 535.32, "Sadia", 15.23, 4),
	("Carvão", 74, "São José", 23.43, 5),
	("Churrasqueira", 32, "George Foreman", 324.52, 5);

#select que retorna os produtos com o valor maior do que 50 reais.
select * from tb_produtos where preco > 50;

#select trazendo  os Produtos com valor entre 3 e 60 reais.
select * from tb_produtos where preco between 3 and 60;

#select utilizando LIKE buscando os produtos com as letras CO.
select * from tb_produtos where nome like "%CO%";

#select com Inner join entre  tabela categoria e produto.
select * from tb_produtos
inner join tb_categorias
on tb_produtos.categoria = tb_categorias.id;

#select onde traz todos os produtos de uma categoria específica (exemplo todos os produtos que são cosméticos).
#nesse caso, todos suínos
select * from tb_produtos
where tb_produtos.categoria = 2;