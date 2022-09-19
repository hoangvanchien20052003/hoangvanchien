package phuong_tien.repository;

import phuong_tien.model.Oto;
import phuong_tien.model.XeTai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeTaiRepository implements IXeTaiRepository {

    Scanner sc = new Scanner(System.in);
    public static List<XeTai> xeTaiList = new ArrayList<>();

    @Override
    public void addXeTai(XeTai xeTai) {
        xeTaiList.add(xeTai);
    }

    @Override
    public List<XeTai> findAll() {
        return xeTaiList;
    }

    @Override
    public void removePhuongTien(int bienKiemSoat) {
        int index = xeTaiList.indexOf(new XeTai(bienKiemSoat));
        if (index != -1) {
            System.out.println("Yes or no: ");
            String nhap = sc.nextLine();
            if (nhap.equals("yes")) {
                xeTaiList.remove(index);
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
        int index = xeTaiList.indexOf(new XeTai(bienKiemSoat));
        if (index != -1) {
            xeTaiList.get(index);
        } else {
            System.out.println("Không tìm thấy");
            return;
        }
    }
}

