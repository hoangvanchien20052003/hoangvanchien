insert into customer
values  (1, 'Minh Quan', 10),
		(2, 'Ngoc Oanh', 20),
        (3, 'Hong Ha', 50);
        
insert into orders
values  (1, 1, '2006-03-21', Null);
INSERT INTO `quanlybanhang`.`orders` (`oID`, `cID`, `oDate`) VALUES ('2', '2', '2006-3-23');
INSERT INTO `quanlybanhang`.`orders` (`oID`, `cID`, `oDate`) VALUES ('3', '1', '2006-3-16');

insert into product
values (1, 'MatGiat', 3);
INSERT INTO `quanlybanhang`.`product` (`pID`, `pName`, `pPrice`) VALUES ('2', 'TuLanh', '5');
INSERT INTO `quanlybanhang`.`product` (`pID`, `pName`, `pPrice`) VALUES ('3', 'DieuHoa', '7');
INSERT INTO `quanlybanhang`.`product` (`pID`, `pName`, `pPrice`) VALUES ('4 ', 'Quat ', '1');
INSERT INTO `quanlybanhang`.`product` (`pID`, `pName`, `pPrice`) VALUES ('5', 'BepDien', '2');

insert into orderdetail
values (1, 1, 3);
INSERT INTO `quanlybanhang`.`orderdetail` (`oID`, `pID`, `odQTY`) VALUES ('1', '3', '7');
INSERT INTO `quanlybanhang`.`orderdetail` (`oID`, `pID`, `odQTY`) VALUES ('1', '4', '2');
INSERT INTO `quanlybanhang`.`orderdetail` (`oID`, `pID`, `odQTY`) VALUES ('2', '1', '1');
INSERT INTO `quanlybanhang`.`orderdetail` (`oID`, `pID`, `odQTY`) VALUES ('3', '1', '8');
INSERT INTO `quanlybanhang`.`orderdetail` (`oID`, `pID`, `odQTY`) VALUES ('2', '5', '4');
INSERT INTO `quanlybanhang`.`orderdetail` (`oID`, `pID`, `odQTY`) VALUES ('2', '3', '3');

-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng order
select oID, oDate, oTotalPrice
from orders;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select customer.cID, customer.cName, customer.cAge, product.pID, product.pName, product.pPrice
from customer
join orders on customer.cID = orders.cID
join orderdetail on orders.oID = orderDetail.oID
join product on orderDetail.pID = product.pID
where customer.cID in (select cID from orders);

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select * from customer
where customer.cID not in (select cID from orders);

-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. Giá bán của từng loại được tính = odQTY*pPrice)
select orders.oID, orders.oDate, sum(orderdetail.odQTY * product.pPrice) As 'Tổng tiền từng hóa đơn'
from orders
join orderdetail on orders.oID = orderdetail.oID
join product on orderdetail.pID = product.pID
group by orders.oID