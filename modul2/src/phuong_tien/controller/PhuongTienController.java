package phuong_tien.controller;

import phuong_tien.model.Oto;
import phuong_tien.model.XeMay;
import phuong_tien.model.XeTai;
import phuong_tien.service.*;

import java.util.List;
import java.util.Scanner;

public class PhuongTienController {
    private static IOtoService otoService = new OtoService();
    private static IXeMayService xeMayService = new XeMayService();
    private static IXeTaiService xeTaiService = new XeTaiService();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon = 0;
        do {
            System.out.println("Chọn chức năng: ");
            System.out.println("1. Thêm mới phương tiện");
            System.out.println("2. Hiển thị phương tiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. Tìm kiếm trên bản kiểm soát");
            System.out.println("5. Thoát");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon){
                case 1:
                    System.out.println("1. Thêm ô tô");
                    System.out.println("2. Thêm xe tải");
                    System.out.println("3. Thêm xe máy");
                    int chon1 = Integer.parseInt(sc.nextLine());
                    switch (chon1){
                        case 1:
                            System.out.println("Nhập biển kiểm soát: ");
                            int bienKiemSoat = Integer.parseInt(sc.nextLine());
                            System.out.println("Nhập tên bản sản xuất: ");
                            String tenBanSanXuat = sc.nextLine();
                            System.out.println("Nhập năm sản xuất: ");
                            int namSanXuat = Integer.parseInt(sc.nextLine());
                            System.out.println("Nhập chủ sở hữu: ");
                            String chuSoHuu = sc.nextLine();
                            System.out.println("Nhập số chổ ngồi: ");
                            int soChoNgoi = Integer.parseInt(sc.nextLine());
                            System.out.println("Nhập kiểu xe: ");
                            String kieuXe = sc.nextLine();
                            Oto oto = new Oto(bienKiemSoat,tenBanSanXuat,namSanXuat,chuSoHuu,soChoNgoi,kieuXe);
                            otoService.addOto(oto);
                            break;
                        case 2:
                            System.out.println("Nhập biển kiểm soát: ");
                            int bienKiemSoat1 = Integer.parseInt(sc.nextLine());
                            System.out.println("Nhập tên bản sản xuất: ");
                            String tenBanSanXuat1 = sc.nextLine();
                            System.out.println("Nhập năm sản xuất: ");
                            int namSanXuat1 = Integer.parseInt(sc.nextLine());
                            System.out.println("Nhập chủ sở hữu: ");
                            String chuSoHuu1= sc.nextLine();
                            System.out.println("Nhập trọng tải: ");
                            double trongTai = Double.parseDouble(sc.nextLine());
                            XeTai xeTai = new XeTai(bienKiemSoat1,tenBanSanXuat1,namSanXuat1,chuSoHuu1,trongTai);
                            xeTaiService.addXeTai(xeTai);
                            break;
                        case 3:
                            System.out.println("Nhập biển kiểm soát: ");
                            int bienKiemSoat2 = Integer.parseInt(sc.nextLine());
                            System.out.println("Nhập tên bản sản xuất: ");
                            String tenBanSanXuat2 = sc.nextLine();
                            System.out.println("Nhập năm sản xuất: ");
                            int namSanXuat2 = Integer.parseInt(sc.nextLine());
                            System.out.println("Nhập chủ sở hữu: ");
                            String chuSoHuu2 = sc.nextLine();
                            System.out.println("Nhập công suất: ");
                            double congSuat = Double.parseDouble(sc.nextLine());
                            XeMay xeMay = new XeMay(bienKiemSoat2,tenBanSanXuat2,namSanXuat2,chuSoHuu2,congSuat);
                            xeMayService.addXeMay(xeMay);
                            break;
                    }
                    break;
                case 2 :
                    System.out.println("1.Hiện thị ô tô: ");
                    System.out.println("2.Hiện thị xe tải: ");
                    System.out.println("3.Hiện thị xe máy: ");
                    int chon2 = Integer.parseInt(sc.nextLine());
                    switch (chon2){
                        case 1:
                            List<Oto> otoList = otoService.findAll();
                            for (Oto oto1 : otoList) {
                                System.out.println(oto1);
                            }
                            break;
                        case 2:
                            List<XeTai> xeTaiList = xeTaiService.findAll();
                            for (XeTai xeTai1 : xeTaiList) {
                                System.out.println(xeTai1);
                            }
                            break;
                        case 3:
                            List<XeMay> xeMayList = xeMayService.findAll();
                            for (XeMay xeMay1 : xeMayList) {
                                System.out.println(xeMay1);
                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1.Xóa ô tô");
                    System.out.println("2.Xóa xe tải");
                    System.out.println("3.Xóa xe máy");
                    int chon3 = Integer.parseInt(sc.nextLine());
                    switch (chon3){
                        case 1:
                            System.out.println("Nhập biển kiểm soát cần xóa");
                            int bienKiemSoatCanXoaOto = Integer.parseInt(sc.nextLine());
                            otoService.removePhuongTien(bienKiemSoatCanXoaOto);
                            break;
                        case 2:
                            System.out.println("Nhập biển kiểm soát cần xóa");
                            int bienKiemSoatCanXoaXeTai = Integer.parseInt(sc.nextLine());
                            xeTaiService.removePhuongTien(bienKiemSoatCanXoaXeTai);
                            break;
                        case 3:
                            System.out.println("Nhập biển kiểm soát cần xóa");
                            int bienKiemSoatCanXoaXeMay = Integer.parseInt(sc.nextLine());
                            xeMayService.removePhuongTien(bienKiemSoatCanXoaXeMay);
                            break;
                    }
                    break;
                case 4:
                    System.out.println("1. Tìm kiếm ô tô");
                    System.out.println("2. Tìm kiếm xe tải");
                    System.out.println("3. Tìm kiếm xe máy");
                    int chon4 = Integer.parseInt(sc.nextLine());
                    switch (chon4){
                        case 1:
                            System.out.println("Nhập biển kiếm soát cần tìm: ");
                            int bienKiemSoatCanTimOto = Integer.parseInt(sc.nextLine());
                            otoService.findBanKiemSoat(bienKiemSoatCanTimOto);
                            break;
                        case 2:
                            System.out.println("Nhập biển kiếm soát cần tìm: ");
                            int bienKiemSoatCanTimXeTai = Integer.parseInt(sc.nextLine());
                            xeTaiService.findBanKiemSoat(bienKiemSoatCanTimXeTai);
                            break;
                        case 3:
                            System.out.println("Nhập biển kiếm soát cần tìm: ");
                            int bienKiemSoatCanTimXeMay = Integer.parseInt(sc.nextLine());
                            xeMayService.findBanKiemSoat(bienKiemSoatCanTimXeMay);
                            break;
                    }
                    break;
            }
        }while(chon != 5);
    }
}
