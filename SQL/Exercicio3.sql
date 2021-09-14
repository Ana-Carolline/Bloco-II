create database db_colegioAnglo;

use db_colegioAnglo;

create table tb_alunos (
	id bigint auto_increment,
    nome varchar (30) not null,
    serie varchar (30) not null,
    periodo varchar (30) not null,
    nota decimal (5,2),
    primary key (id)
);

select * from tb_alunos;

insert into tb_alunos (nome, serie, periodo, nota) values ("Ana Carolline", "8 série", "diurno", 9.0);
insert into tb_alunos (nome, serie, periodo, nota) values ("Bruna Neves", "8 série", "noturno", 10.0);
insert into tb_alunos (nome, serie, periodo, nota) values ("José Francisco", "8 série", "vespertino", 3.0);
insert into tb_alunos (nome, serie, periodo, nota) values ("Jessica Almeida", "6 série", "diurno", 6.5);
insert into tb_alunos (nome, serie, periodo, nota) values ("Eduardo Veschi", "3 ano", "diurno", 5.0);
insert into tb_alunos (nome, serie, periodo, nota) values ("Antônio Olimpo", "2 ano", "noturno", 4.0);
insert into tb_alunos (nome, serie, periodo, nota) values ("Matheus Borges", "4 série", "diurno", 2.0);
insert into tb_alunos (nome, serie, periodo, nota) values ("Emanuel Muniz", "3 série", "vespertino", 9.5);

select * from tb_alunos where nota > 7.0;
select * from tb_alunos where nota < 7.0;

update tb_alunos set nota = 10.0 where id = 5;

select * from tb_alunos