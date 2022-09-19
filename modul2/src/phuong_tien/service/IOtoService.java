package phuong_tien.service;

import phuong_tien.model.Oto;
import phuong_tien.model.PhuongTien;

import java.util.List;

public interface IOtoService {
    void addOto(Oto oto);

    List<Oto> findAll();

    void removePhuongTien(int bienKiemSoat);

    void findBanKiemSoat(int bienKiemSoat);
}
