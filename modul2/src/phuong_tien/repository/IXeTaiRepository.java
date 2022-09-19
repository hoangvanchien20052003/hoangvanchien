package phuong_tien.repository;

import phuong_tien.model.Oto;
import phuong_tien.model.XeTai;

import java.util.List;

public interface IXeTaiRepository {
    void addXeTai(XeTai xeTai);

    List<XeTai> findAll();

    void removePhuongTien(int bienKiemSoat);

    void findBanKiemSoat(int bienKiemSoat);
}
