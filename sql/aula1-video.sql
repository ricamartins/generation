use db_estoque;

CREATE TABLE tb_marcas(
    id bigint(5) AUTO_INCREMENT, -- Definindo como auto Incremente 1, 2, 3 ...
    nome varchar(20) NOT NULL,
    ativo boolean,
    PRIMARY KEY (id) -- Definir coluna id como chave primária
);

INSERT INTO tb_marcas (nome, ativo) VALUES
	("Nike", true),
	("H&M", true),
	("Zara", true),
	("Louis Vuitton", true),
	("Adidas", true),
	("Uniqlo", true),
	("Hermès", true),
	("Rolex", true),
	("Gucci", true),
	("Cartier", true),
	("Polo", true),
	("Armany", true);

select * from tb_marcas;