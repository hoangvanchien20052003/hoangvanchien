package phuong_tien.service;

import phuong_tien.model.Oto;
import phuong_tien.model.XeMay;
import phuong_tien.repository.IOtoRepository;
import phuong_tien.repository.IXeMayRepository;
import phuong_tien.repository.OtoRepository;
import phuong_tien.repository.XeMayRepository;

import java.util.List;

public class XeMayService implements IXeMayService {
    private IXeMayRepository xeMayRepository = new XeMayRepository();
    @Override
    public void addXeMay(XeMay xeMay) {
        xeMayRepository.addXeMay(xeMay);
    }

    @Override
    public List<XeMay> findAll() {
        return xeMayRepository.findAll();
    }

    @Override
    public void removePhuongTien(int bienKiemSoat) {
        xeMayRepository.removePhuongTien(bienKiemSoat);
    }

    public void findBanKiemSoat(int bienKiemSoat){
        xeMayRepository.findBanKiemSoat(bienKiemSoat);
    }
}
