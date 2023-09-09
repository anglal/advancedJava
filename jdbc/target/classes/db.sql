#jdbc:mysql://localhost:3306/mydb

create database if not exists mydb;
use mydb;

drop table if exists subject;
drop table if exists student;

create table subject(id int primary key AUTO_INCREMENT, name varchar(25));
create table student(id int primary key AUTO_INCREMENT, student_name varchar(20), score float, subject_id int references subject(id));