package phuong_tien.service;

import phuong_tien.model.Oto;
import phuong_tien.repository.IOtoRepository;
import phuong_tien.repository.OtoRepository;

import java.util.List;

public class OtoService implements IOtoService {
    private IOtoRepository otoRepository = new OtoRepository();
    @Override
    public void addOto(Oto oto) {
        otoRepository.addOto(oto);
    }

    @Override
    public List<Oto> findAll() {
        return otoRepository.findAll();
    }

    @Override
    public void removePhuongTien(int bienKiemSoat) {
        otoRepository.removePhuongTien(bienKiemSoat);
    }

    public void findBanKiemSoat(int bienKiemSoat){
        otoRepository.findBanKiemSoat(bienKiemSoat);
    }
}
