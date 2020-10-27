use modelagem;

select * from veiculos;
select * from proprietarios;

insert into proprietarios (id_dono, nome_dono) values
	(1, "Julio"),
	(2, "Rosana");
    
insert into veiculos values (1, "Volkswagen", "Gol", "BAH-2414", "2016", 2);

select * from veiculos
inner join proprietarios where veiculos.proprietarios_id_dono = proprietarios.id_dono;