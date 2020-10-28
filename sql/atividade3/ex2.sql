create database db_construindo_a_nossa_vida;
use db_construindo_a_nossa_vida;

create table tb_categorias (
	id int auto_increment not null,
    categoria varchar(40),
    desconto boolean,
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

insert into tb_categorias (categoria, desconto) values
	("Ferramenta", true),
	("Material", true),
	("Decoração", false),
	("Elétrico", false),
	("Acessório", false);
    
insert into tb_produtos (nome, estoque, marca, preco, categoria) values
	("Martelo", 46, "Dexter", 28.90, 1),
	("Serrote", 56, "Dexter", 27.90, 1),
    ("Chave de fenda", 75, "Tramontina", 25.90, 1),
    ("Tijolo", 567, "Nova Conquista", 1.49, 2),
	("Cimento", 254, "Votoran", 23.90, 2),
	("Azulejo", 276, "Artens", 3.99, 3),
	("Furadeira", 44, "Bosch", 339.49, 4),
	("Trena", 56, "Sparta", 11.79, 5);

#select que retorna os produtos com o valor maior do que 50 reais.
select * from tb_produtos where preco > 50;

#select trazendo  os Produtos com valor entre 3 e 60 reais.
select * from tb_produtos where preco between 3 and 60;

#select utilizando LIKE buscando os produtos com as letras CO.
select * from tb_produtos where nome like "%CI%";

#select com Inner join entre  tabela categoria e produto.
select * from tb_produtos
inner join tb_categorias
on tb_produtos.categoria = tb_categorias.id;

#select onde traz todos os produtos de uma categoria específica (exemplo todos os produtos que são cosméticos).
#nesse caso, elétrico
select * from tb_produtos
where tb_produtos.categoria = 4;