package phuong_tien.repository;

import phuong_tien.model.Oto;
import phuong_tien.model.XeMay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeMayRepository implements IXeMayRepository {

    Scanner sc = new Scanner(System.in);
    public static List<XeMay> xeMayList = new ArrayList<>();

    @Override
    public void addXeMay(XeMay xeMay) {

    }

    @Override
    public List<XeMay> findAll() {
        return xeMayList;
    }

    @Override
    public void removePhuongTien(int bienKiemSoat) {
        int index = xeMayList.indexOf(new XeMay(bienKiemSoat));
        if (index != -1) {
            System.out.println("Yes or no: ");
            String nhap = sc.nextLine();
            if (nhap.equals("yes")) {
                xeMayList.remove(index);
                System.out.println("Xóa thành công");
            } else {
                System.out.println("Không xóa");
            }
        } else {
            System.out.println("Không tìm thấy");
            return;
        }
    }

    public void findBanKiemSoat(int bienKiemSoat) {
        int index = xeMayList.indexOf(new XeMay(bienKiemSoat));
        if (index != -1) {
            xeMayList.get(index);
        } else {
            System.out.println("Không tìm thấy");
            return;
        }
    }
}

