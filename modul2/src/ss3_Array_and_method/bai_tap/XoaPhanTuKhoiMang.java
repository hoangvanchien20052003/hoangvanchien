package ss3_Array_and_method.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int del;
        int index=0;
        System.out.printf("Nhâp độ dài của mảng: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Nhập phần tử "+i+" cho mảng: ");
            arr[i] = sc.nextInt();
        }
        System.out.printf("Nhập phần tử muốn xóa: ");
        del = sc.nextInt();
        for (int j = 0; j < size; j++) {
            if (arr[j] == del) {
                index = j;
            }
        }
        for (int k = index; k < size-1; k++) {
            arr[k] = arr[k + 1];
        }
        size--;
        System.out.printf("Phần tử của mảng sau khi xóa:");
        for (int e = 0; e < size; e++) {
            System.out.printf(arr[e] + "\t");
        }
    }
}
