CREATE TABLE tb_venda (
    idVenda SMALLINT PRIMARY KEY AUTO_INCREMENT,
    produto VARCHAR(255) NOT NULL,
    preco DECIMAL(10.2) UNSIGNED,
    horarioVenda DATETIME DEFAULT CURRENT_TIMESTAMP,
    dataEntrega DATE,
    horaEntrega TIME
);
insert into tb_venda(produto, preco, dataEntrega, horaEntrega)
values ("Ecosport", 70.000, "2020-12-03", "13:40:00");

select * from tb_venda;