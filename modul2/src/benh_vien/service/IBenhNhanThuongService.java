package benh_vien.repository;

import benh_vien.model.BenhNhanThuong;
import dien_thoai.model.DienThoaiChinhHang;

import java.util.List;

public interface IBenhNhanThuongRepository {
    void themBenhNhan(BenhNhanThuong benhNhanThuong);

    void xoaBenhNhan(String ma);

    List<BenhNhanThuong> findAll();
}
