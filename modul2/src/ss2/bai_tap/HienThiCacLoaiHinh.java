package ss2.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập chiều dài : ");
        int dai = sc.nextInt();
        System.out.printf("Nhập chiều rộng : ");
        int rong = sc.nextInt();
        for (int i = 0; i < rong; i++) {
            for (int j = 0; j < dai; j++) {
                System.out.printf(" * ");
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
        System.out.printf("\n");
        System.out.printf("Nhập chiều cao :  ");
        int cao = sc.nextInt();
        for (int h = 0; h < cao; h++) {
            for (int k = 0; k <= h; k++) {
                System.out.printf(" * ");
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
        System.out.printf("\n");
        for (int m = cao; m >= 1; m--) {
            for (int n = 1; n <= m; n++) {
                System.out.printf(" * ");
            }
            System.out.printf("\n");
        }
    }
}

