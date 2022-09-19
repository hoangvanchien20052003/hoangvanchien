package phuong_tien.repository;

import phuong_tien.model.Oto;
import phuong_tien.model.XeMay;

import java.util.List;

public interface IXeMayRepository {
    void addXeMay(XeMay xeMay);

    List<XeMay> findAll();

    void removePhuongTien(int bienKiemSoat);

    void findBanKiemSoat(int bienKiemSoat);
}
