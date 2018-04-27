create database prathap1;
use prathap1; 

create table departments(
did integer(10) primary key, dname character(20) NOT NULL, noemp int(10));


create table subjects(
sid integer primary key, sname character(20) NOT NULL, dep integer(10),  foreign key(dep) references  departments(did));



 CREATE TABLE employee(
ssn integer primary key, 
ename character varying(20) NOT NULL,
age int(10) not null, sex character(6) NOT NULL,dep integer(10), foreign key(dep) references departments(did),sid integer, foreign key(sid) references subjects(sid));




