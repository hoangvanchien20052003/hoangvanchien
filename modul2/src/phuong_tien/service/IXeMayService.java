package phuong_tien.service;

import phuong_tien.model.Oto;
import phuong_tien.model.XeMay;

import java.util.List;

public interface IXeMayService {
    void addXeMay(XeMay xeMay);

    List<XeMay> findAll();

    void removePhuongTien(int bienKiemSoat);

    void findBanKiemSoat(int bienKiemSoat);
}
