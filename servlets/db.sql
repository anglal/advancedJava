
create database if not exists mydb;
use mydb;
create table if not exists users( email varchar(40), password varchar(40));
insert into users values('jhondoe@xyz.com', 'qwerty');
insert into users values('janedoe@xyz.com', 'abcdef');
insert into users values('abc@xyz.com','abc');