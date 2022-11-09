package benh_vien.repository;

import benh_vien.model.BenhNhanThuong;

import java.util.ArrayList;
import java.util.List;

public class BenhNhanThuongRepository implements IBenhNhanThuongRepository{
    private final String FILE_PATH = "D:\\CODEGYM\\module2\\hoangvanchien\\modul2\\src\\benh_vien\\model\\benhnhanthuong.csv";

    List<BenhNhanThuong> benhNhanThuongList = new ArrayList<>();
    @Override
    public void themBenhNhan(BenhNhanThuong benhNhanThuong) {
        benhNhanThuongList.add(benhNhanThuong);
    }

    @Override
    public void xoaBenhNhan(String ma) {


    }

    @Override
    public List<BenhNhanThuong> findAll() {
        return null;
    }
}
