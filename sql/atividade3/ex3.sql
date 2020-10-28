create database db_curso_da_minha_vida;
use db_curso_da_minha_vida;

create table tb_categorias (
	id int auto_increment not null,
    categoria varchar(40),
    sala int,
    primary key (id)
);

create table tb_cursos (
	id int auto_increment not null,
    nome varchar(40),
    vagas int,
    professor varchar(30),
    preco decimal(5,2),
    categoria int,
    primary key (id),
    foreign key (categoria) references tb_categorias (id)
);

insert into tb_categorias (categoria, desconto) values
	("Humanas", 1),
	("Naturais", 2),
	("Exatas", 3),
	("Tecnológicas", 4),
	("Artes", 5);
    
insert into tb_produtos (nome, vagas, professor, preco, categoria) values
	("História", 46, "Chris", 168.90, 1),
	("Física", 36, "Milton", 327.90, 2),
    ("Química", 55, "Tatiana", 225.90, 2),
    ("Matemática", 67, "Narval", 189.49, 3),
	("Java", 54, "Ednilson", 423.90, 2),
	("Javascript", 76, "Arminda", 533.99, 3),
	("Python", 64, "Bruna", 439.49, 4),
	("Música", 56, "Suzano", 201.79, 5);

#select que retorna os cursos com o valor maior do que 250 reais.
select * from cursos where preco > 250;

#select trazendo  os cursos com valor entre 230 e 360 reais.
select * from cursos where preco between 230 and 360;

#select utilizando LIKE buscando os produtos com as letras CO.
select * from cursos where nome like "%JAV%";

#select com Inner join entre  tabela categoria e produto.
select * from tb_cursos
inner join tb_categorias
on tb_cursos.categoria = tb_categorias.id;

#select onde traz todos os produtos de uma categoria específica (exemplo todos os produtos que são cosméticos).
#nesse caso, naturais
select * from tb_cursos
where tb_produtos.categoria = 2;