create database QuanLiSinhVien;
create table class(
	id int,
    name nvarchar(50),
    constraint pk_id primary key(id)
);

create table teacher(
	id int,
    name nvarchar(50),
    age int,
    country nvarchar(50),
    constraint pk_id_teacher primary key(id)
);	