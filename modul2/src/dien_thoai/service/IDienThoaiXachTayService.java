package dien_thoai.repository;

import dien_thoai.model.DienThoaiChinhHang;
import dien_thoai.model.DienThoaiXachTay;

import java.util.List;

public interface IDienThoaiXachTayRepository {
    void addPhone(DienThoaiXachTay dienThoaiXachTay);

    void removePhone(int ID);

    List<DienThoaiXachTay> findAlls();

    void findName(String name);
}
