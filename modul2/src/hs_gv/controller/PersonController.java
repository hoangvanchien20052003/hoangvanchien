package hs_gv.controller;

import java.util.Scanner;

public class PersonController {
    public static void main(String[] args) {
        int chon = 0;
       do {
           Scanner sc = new Scanner(System.in);
           System.out.println("Chon doi tuong de tiep tuc: ");
           System.out.println("1.Hoc sinh");
           System.out.println("2.Giang vien");
           System.out.println("3.Thoat");
           chon = Integer.parseInt(sc.nextLine());
           switch (chon) {
               case 1:
                   StudentController.Student();
                   break;
           }
       }
       while (chon !=3);
       }
}
