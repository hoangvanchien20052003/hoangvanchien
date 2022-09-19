package phuong_tien.repository;

import phuong_tien.model.Oto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OtoRepository implements IOtoRepository {

    Scanner sc = new Scanner(System.in);
    public static List<Oto> otoList = new ArrayList<>();

    @Override
    public void addOto(Oto oto) {
        otoList.add(oto);
    }

    @Override
    public List<Oto> findAll() {
        return otoList;
    }

    @Override
    public void removePhuongTien(int bienKiemSoat) {
        int index = otoList.indexOf(new Oto(bienKiemSoat));
        if(index != -1){
            System.out.println("Yes or no: ");
            String nhap = sc.nextLine();
            if(nhap.equals("yes")){
                otoList.remove(index);
                System.out.println("Xóa thành công");
            }
            else {
                System.out.println("Không xóa");
            }
        }
        else {
            System.out.println("Không tìm thấy");
            return;
        }
    }
    public void findBanKiemSoat(int bienKiemSoat){
        int index = otoList.indexOf(new Oto(bienKiemSoat));
        if(index != -1){
            otoList.get(index);
        }
        else {
            System.out.println("Không tìm thấy");
            return;
        }
    }
}

