package benh_vien.service;

import benh_vien.model.BenhNhanThuong;
import benh_vien.repository.BenhNhanThuongRepository;
import benh_vien.repository.IBenhNhanThuongRepository;

import java.util.List;

public class BenhNhanThuongService implements IBenhNhanThuongService{
    IBenhNhanThuongRepository benhNhanThuongRepository = new BenhNhanThuongRepository();

    @Override
    public void themBenhNhan(BenhNhanThuong benhNhanThuong) {
        benhNhanThuongRepository.themBenhNhan(benhNhanThuong);
    }

    @Override
    public void xoaBenhNhan(String ma) {
        benhNhanThuongRepository.xoaBenhNhan(ma);
    }

    @Override
    public List<BenhNhanThuong> findAll() {
        return benhNhanThuongRepository.findAll();
    }
}
