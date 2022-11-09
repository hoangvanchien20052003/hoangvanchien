create database Product;

create table Products(
	id int,
    productCode varchar(10),
    productName nvarchar(50),
    productPrice float,
    productAmount int,
    productDescription nvarchar(50),
    productStatus bit,
    constraint pk_id primary key(id)
);

-- Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục)
create unique index uniqueindex on Products(productCode);

-- Tạo Composite Index trên bảng Products (sử dụng 2 cột productName và productPrice)
create index simpleindex on Products(productName,productPrice);

-- Sử dụng câu lệnh EXPLAIN để biết được câu lệnh SQL của bạn thực thi như nào
explain select * from products
where productCode = 1;




