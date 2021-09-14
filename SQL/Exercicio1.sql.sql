create database db_recursosHumanos;

use db_recursosHumanos;

create table tb_funcionaries(
	id bigint auto_increment,
    nome varchar (30) not null,
    cargo varchar (30) not null, 
    salario decimal (10,2),
    primary key (id)
);


insert into tb_funcionaries (nome, cargo, salario) values ("Guilherme Bueno", "Operador Caixa", 2000.00);
insert into tb_funcionaries (nome, cargo, salario) values ("Fernanda Silva", "Vendedora", 2500.00);
insert into tb_funcionaries (nome, cargo, salario) values ("Isaac Rodrigues", "Costureiro", 1500.00);
insert into tb_funcionaries (nome, cargo, salario) values ("Ana Carolline", "Desenvolvedora", 5000.00);
insert into tb_funcionaries (nome, cargo, salario) values ("Lucimeire Lima", "Autônoma", 10000.00);

select * from tb_funcionaries where salario > 2000.00;
select * from tb_funcionaries where salario < 2000.00;

update tb_funcionaries set salario = 8000.00 where id = 4;

select * from tb_funcionaries