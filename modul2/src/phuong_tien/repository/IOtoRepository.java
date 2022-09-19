package phuong_tien.repository;

import phuong_tien.model.Oto;

import java.util.List;

public interface IOtoRepository {
    void addOto(Oto oto);

    List<Oto> findAll();

    void removePhuongTien(int bienKiemSoat);

    void findBanKiemSoat(int bienKiemSoat);

}
