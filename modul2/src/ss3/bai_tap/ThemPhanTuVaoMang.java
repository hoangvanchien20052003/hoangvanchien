package ss3.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int add;
        int index;
        System.out.printf("Nhập độ dài của mảng: ");
        int size = sc.nextInt();
        int arr[] = new int[10];
        for (int i = 0; i < size; i++) {
            System.out.printf("Nhập phần tử " + i + " của mảng: ");
            arr[i] = sc.nextInt();
        }
        System.out.printf("Nhập số cần chèn: ");
        add = sc.nextInt();
        do {
            System.out.printf("Nhập vị trí cần chèn: ");
            index = sc.nextInt();
            if (index <= 1 || index > arr.length - 1) {
                System.out.printf("Nhập lại! Không thêm vào mảng được");
            }
        } while (index <= 1 || index > arr.length - 1);
        for (int j = size - 1; j >= index; j--) {
            arr[j + 1] = arr[j];
        }
        arr[index] = add;

        //HỎI CÁCH TĂNG KÍCH THƯỚC SAU KHI THÊM

        System.out.printf("Mảng sau khi thêm : ");
        for (int h = 0; h < arr.length; h++) {
            System.out.printf(arr[h] + "\t");
        }
    }
}
