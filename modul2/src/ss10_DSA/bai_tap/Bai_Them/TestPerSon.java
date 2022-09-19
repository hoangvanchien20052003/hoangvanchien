package ss10_DSA.bai_tap.Bai_Them;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class TestPerSon {
    static Student student = new Student();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN --");
            System.out.println("Chọn chức năng theo số (để tiếp tục):\n" +
                    "1. Thêm mới giảng viên hoặc học sinh\n" +
                    "2. Xóa giảng viên hoặc học sinh\n" +
                    "3. Xem danh sách giảng viên hoặc học sinh\n" +
                    "4. Thoát\n");
            System.out.printf("Chọn chức năng: ");
            num = Integer.parseInt(scanner.nextLine());
            switch (num){
                case 1:
                    System.out.println("Mã sinh viên: ");
                    String id = scanner.nextLine();
                    System.out.println("Họ và tên: ");
                    String name = scanner.nextLine();
                    System.out.println("Giới tính: ");
                    String gender = scanner.nextLine();
                    System.out.println("Năm sinh: ");
                    Double yearOfBirth = Double.parseDouble(scanner.nextLine());
                    System.out.println("Lớp học: ");
                    String className = scanner.nextLine();
                    System.out.println("Điểm: ");
                    Double score = Double.parseDouble(scanner.nextLine());
                    Student students = new Student(id, name, yearOfBirth, gender, className, score);
                    student.themMoi(students);
                    break;
//                case 2 :
//                    System.out.printf("Nhập vào id của sinh viên muốn xóa: ");
//                    String xoaID = scanner.nextLine();
//                    System.out.println("Yes or No ?");
//                    String answer = scanner.nextLine();
//                    if(student.getMa().equals(xoaID)) {
//                        if (xoaID.equals("Yes")) {
//                            student.xoa(xoaID);
//                        } else {
//                            break;
//                        }
//                    }
//                    break;
                case 3:
                    System.out.println("Danh sách sinh viên: ");
                    student.danhSach();
                    break;
            }
        }while (num != 4);

    }
}
