create table cliente(
id bigint not null primary key auto_increment,
nome varchar(100),
endereco varchar(100),
numero varchar(50),
bairro varchar(50),
id_municipio int not null,
telefone varchar(30),
celular varchar(30)
);

create table municipio(
id int not null primary key auto_increment,
nome varchar(100),
estado char(2)
);

create table lancamento(
id bigint not null primary key auto_increment,
datalancamento date,
idcliente bigint not null,
tipolancamento varchar(10),
valorlancamento decimal(12,2)
);

alter table lancamento add constraint fk_cliente_lancamento foreign key (idcliente) references cliente(id);
alter table cliente add constraint fk_municipio_cliente foreign key (id_municipio) references municipio(id);


