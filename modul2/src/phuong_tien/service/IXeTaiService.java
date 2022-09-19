package phuong_tien.service;

import phuong_tien.model.Oto;
import phuong_tien.model.XeTai;

import java.util.List;

public interface IXeTaiService {
    void addXeTai(XeTai xeTai);

    List<XeTai> findAll();

    void removePhuongTien(int bienKiemSoat);

    void findBanKiemSoat(int bienKiemSoat);
}
