package hs_gv.controller;

import hs_gv.model.Student;
import hs_gv.reponsitory.IStudentReponsitory;
import hs_gv.service.IStudentService;
import hs_gv.service.StudentService;

import java.util.List;
import java.util.Scanner;

public class StudentController {
    public static IStudentService iStudentService = new StudentService();

    public static void Student() {
        Scanner sc = new Scanner(System.in);
        int chon = 0;
        do {
            System.out.println("Chon chuc nang theo so(de tiep tuc):");
            System.out.println("1.Them moi hoc sinh:");
            System.out.println("2.Xoa hoc sinh:");
            System.out.println("3.Xem danh sach hoc sinh:");
            System.out.println("4.Thoat");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("Them ten hs: ");
                    String ten = sc.nextLine();
                    System.out.println("Them ngay sinh hs: ");
                    int ngaySinh = Integer.parseInt(sc.nextLine());
                    System.out.println("Them gioi tinh hs: ");
                    String gioiTinh = sc.nextLine();
                    System.out.println("Them ma hs: ");
                    String ma = sc.nextLine();
                    System.out.println("Them lop cua hs: ");
                    String lop = sc.nextLine();
                    System.out.println("Them diem so hs: ");
                    double diemSo = Double.parseDouble(sc.nextLine());
                    Student student = new Student(ten, ngaySinh, gioiTinh, ma, lop, diemSo);
                    iStudentService.addStudent(student);
                    break;
                case 2:
                    System.out.println("Nhap ma hoc sinh muon xoa");
                    String xoa = sc.nextLine();
                    iStudentService.removeStudent(xoa);
                    break;
                case 3:
                    List<Student> studentList = iStudentService.findAll();
                    for (Student student1:studentList) {
                        System.out.println(student1);
                    }
                    break;
                case 4:
                    return;
            }
        }
            while (true) ;
    }
}
