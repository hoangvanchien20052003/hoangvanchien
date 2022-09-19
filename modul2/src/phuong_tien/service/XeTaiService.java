package phuong_tien.service;

import phuong_tien.model.Oto;
import phuong_tien.model.XeTai;
import phuong_tien.repository.IOtoRepository;
import phuong_tien.repository.IXeTaiRepository;
import phuong_tien.repository.OtoRepository;
import phuong_tien.repository.XeTaiRepository;

import java.util.List;

public class XeTaiService implements IXeTaiService {
    private IXeTaiRepository xeTaiRepository = new XeTaiRepository();

    @Override
    public void addXeTai(XeTai xeTai) {
        xeTaiRepository.addXeTai(xeTai);
    }

    @Override
    public List<XeTai> findAll() {
        return xeTaiRepository.findAll();
    }

    @Override
    public void removePhuongTien(int bienKiemSoat) {
        xeTaiRepository.removePhuongTien(bienKiemSoat);
    }

    public void findBanKiemSoat(int bienKiemSoat){
        xeTaiRepository.findBanKiemSoat(bienKiemSoat);
    }
}
