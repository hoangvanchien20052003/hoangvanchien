create database Furama;

create table ViTri(
	maViTri int,
    tenViTri varchar(45),
    constraint pk_maViTri primary key(maViTri)
);

create table TrinhDo(
	maTrinhDo int,
    tenTrinhDo varchar(45),
    constraint pk_maTrinhDo primary key(maTrinhDo)
);

create table BoPhan(
	maBoPhan int,
    tenBoPhan varchar(45),
    constraint pk_maBoPhan primary key(maBoPhan)
);

create table NhanVien(
	maNhanVien int,
    hoTenNV varchar(45),
	ngaySinhNV date,
    cmndNV varchar(45),
    luong double,
    sdtNV varchar(45),
    emailNV varchar(45),
    diaChiNV varchar(45),
    maViTri int,
    maTrinhDo int,
    maBoPhan int,
    constraint pk_maNhanVien primary key(maNhanVien),
    constraint fk_maViTri foreign key(maViTri) references ViTri(maViTri),
    constraint fk_maTrinhDo foreign key(maTrinhDo) references TrinhDo(maTrinhDo),
    constraint fk_maBoPhan foreign key(maBoPhan) references BoPhan(maBoPhan)
);

create table LoaiKhach(
	maLoaiKhach int,
    tenLoaiKhach varchar(45),
    constraint pk_maLoaiKhach primary key(maLoaiKhach)
);

create table KhachHang(
	maKhachHang int,
    maLoaiKhach int,
    hoTenKH varchar(45),
    ngaySinhKH date,
    gioiTinh bit,
    cmndKH varchar(45),
    sdtKH varchar(45),
    emailKH varchar(45),
    diaChiKH varchar(45),
    constraint pk_maKhachHang primary key(maKhachHang),
    constraint fk_maLoaiKhach foreign key(maLoaiKhach) references LoaiKhach(maLoaiKhach)
);

create table DichVuDiKem(
	maDichVuDiKem int,
    tenDichVuDiKem varchar(45),
    gia double,
    doVi varchar(10),
    trangThai varchar(45),
    constraint pk_maDichVuDiKem primary key(maDichVuDiKem)
);

create table KieuThue(
	maKieuThue int,
    tenKieuThue varchar(45),
    constraint pk_maKieuThue primary key(maKieuThue)
);

create table LoaiDichVu(
	maLoaiDichVu int,
    tenLoaiDichVu varchar(45),
    constraint pk_maLoaiDichVu primary key(maLoaiDichVu)
);

create table DichVu(
	maDichVu int,
    tenDichVu varchar(45),
    dienTich int,
    chiPhiThue double,
    soNguoiToiDa int,
    maKieuThue int,
    maLoaiDichVu int,
    tieuChuanPhong varchar(45),
    moTaTienNghiKhac varchar(45),
    dienTichHoBoi double,
    soTang int,
    constraint pk_maDichVu primary key(maDichVu),
    constraint fk_maKieuThue foreign key(maKieuThue) references KieuThue(maKieuThue),
    constraint fk_maLoaiDichVu foreign key(maLoaiDichVu) references LoaiDichVu(maLoaiDichVu)
);

create table HopDong(
	maHopDong int,
    ngayLamHopDong datetime,
    ngayKetThuc datetime,
    tienDatCoc double,
    maNhanVien int,
    maKhachHang int,
    maDichVu int,
    constraint pk_maHopDong primary key(maHopDong),
    constraint fk_MaNhanVien foreign key(maNhanVien) references NhanVien(maNhanVien),
    constraint fk_MaKhachHang foreign key(maKhachHang) references KhachHang(maKhachHang),
    constraint fk_MaDichVu foreign key(maDichVu) references DichVu(maDichVu)
);

create table HopDongChiTiet(
	maHopDongChiTiet int,
    maHopDong int,
    maDichVuDiKem int,
    soLuong int,
    constraint pk_maHopDongChiTiet primary key(maHopDongChiTiet),
    constraint fk_MaHopDong foreign key(maHopDong) references HopDong(maHopDong),
    constraint fk_maDichVuDiKem foreign key(maDichVuDiKem) references DichVuDiKem(maDichVuDiKem)
);





