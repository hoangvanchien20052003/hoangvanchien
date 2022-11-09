package dien_thoai.repository;

import dien_thoai.model.DienThoaiChinhHang;

import java.util.List;

public interface IDienThoaiChinhHang {

    void addPhone(DienThoaiChinhHang dienThoaiChinhHang);

    void removePhone(int ID);

    List<DienThoaiChinhHang> findAlls();

    void findName(String name);
}

