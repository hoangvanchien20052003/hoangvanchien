create database QuanLiVatTu;
create table PhieuXuat(
	SoPX int,
	NgayXuat int,
    constraint pk_soPX primary key(SoPX)
);

create table VatTu(
	MaVTU int,
    TenVTU nvarchar(50),
    constraint pk_maVTU primary key(MaVTU)
);

create table ChiTietPhieuXuat(
	SoPX int,
    MaVTU int,
    DGXuat int,
    SLXuat int,
    constraint pk_soPX_maVTU primary key(SoPX,MaVTU),
	constraint fk_maVTU foreign key(MaVTU) references VatTu(MaVTU),
    constraint fk_soPX foreign key(SoPX) references PhieuXuat(SoPX)
);

create table PhieuNhap(
	SoPN int,
    NgayNhap date,
    constraint pk_soPN primary key(SoPN)
);

create table ChiTietPhieuNhap(
	MaVTU int,
    SoPN int,
    DGNhap int,
    SLNhap int,
    constraint pk_maVTU_soPN primary key(MaVTU,SoPN),
    constraint fk_MaVT foreign key(MaVTU) references VatTu(MaVTU),
    constraint fk_SoPN foreign key(SoPN) references PhieuNhap(SoPN)
);

create table NhaCC(
	MaNCC int,
    TenNCC nvarchar(50),
    DiaChi nvarchar(50),
    constraint pk_maNCC primary key(MaNCC)
);

create table DonDH(
	SoDH int,
    NgayDH date,
    MaNCC int,
    constraint pk_soDH primary key(soDH),
    constraint fk_MaNCC foreign key(MaNCC) references NhaCC(MaNCC)
);

create table CungCap(
	SDT varchar(10),
    MaNCC int,
    constraint pk_sdt_maNCC primary key(SDT,MaNCC),
    constraint fk_maNhaCC foreign key(MaNCC) references NhaCC(MaNCC)
);

create table ChiTietDonDatHang(
	MaVTU int,
    SoDH int,
    constraint pk_maVTU_soDH primary key(MaVTU,SoDH),
    constraint fk_MVT foreign key(MaVTU) references VatTU(MaVTU),
    constraint fk_soDH foreign key(SoDH) references DonDH(soDH)
);
