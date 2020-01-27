--liquibase formatted sql

--changeset ruddy:1
create table USER (
id double primary key,
name varchar(255)
);

insert into USER (id, name) values (1, 'test');