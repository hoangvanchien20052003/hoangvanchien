create database QuanLyBanHang;
create table Customer(
	cID int,
    cName nvarchar(50),
    cAge int,
    constraint pk_cID primary key(cID)
);

create table Orders(
	oID int,
    cID int,
    oDate date,
    oTotalPrice double,
    constraint pk_oID primary key(oID),
    constraint fk_cID foreign key(cID) references Customer(cID)
);

create table Product(
	pID int,
    pName nvarchar(50),
    pPrice double,
    constraint pk_pID primary key(pID)
);

create table OrderDetail(
	oID int,
    pID int,
    odQTY int,
    constraint pk_oID_pID primary key(oID,pID)
);
