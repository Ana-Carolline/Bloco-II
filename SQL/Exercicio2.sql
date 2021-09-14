create database db_lojinha;

use db_lojinha;

create table tb_produtos(
	id bigint auto_increment,
    nome varchar (30) not null,
    marca varchar (30) not null, 
    preco decimal (10,2),
    primary key (id)
);

select * from tb_produtos;

insert into tb_produtos (nome, marca, preco) values ("Vestido", "Pride", 580.00);
insert into tb_produtos (nome, marca, preco) values ("Tênis", "Nike", 235.90);
insert into tb_produtos (nome, marca, preco) values ("Salto", "Santa Lolla", 657.00);
insert into tb_produtos (nome, marca, preco) values ("Sapatilha", "Melissa", 575.90);
insert into tb_produtos (nome, marca, preco) values ("Shorts", "Revanche", 355.00);
insert into tb_produtos (nome, marca, preco) values ("Blusa", "Colcci", 534.99);
insert into tb_produtos (nome, marca, preco) values ("Saia", "Cavalera",679.98);
insert into tb_produtos (nome, marca, preco) values ("Cinto", "Boutique", 499.99);

select * from tb_produtos where preco > 500.00;
select * from tb_produtos where preco < 500.00;

update tb_produtos set preco = 200.00 where id = 3;

select * from tb_produtos;