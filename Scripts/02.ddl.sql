create table department (
deptno number not null,
deptname varchar2(50) not null,
floor number null,
primary key (deptno)
);


create table employee (
empno number not null primary key,
empname varchar2(50) not null,
title varchar2(50) null,
manager number null,
salary number null,
dno number null,
foreign key(manager) references employee(empno),
foreign key(dno) references department(deptno)
);

SELECT * FROM USER_TABLES ;