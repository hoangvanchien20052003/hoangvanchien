package ss3.bai_tap;

import java.sql.Array;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập độ dài mảng 1 : ");
        int size1 = sc.nextInt();
        int arr1[]=new int[size1];
        for (int i = 0;i< arr1.length;i++){
            System.out.printf("Nhập phần tử " +i+" của mảng 1 : ");
            arr1[i] = sc.nextInt();
        }
        System.out.printf("Nhập độ dài mảng 2 : ");
        int size2 = sc.nextInt();
        int arr2[]=new int[size2];
        for (int i = 0;i< arr2.length;i++){
            System.out.printf("Nhập phần tử " +i+" của mảng 2 : ");
            arr2[i] = sc.nextInt();
        }
        int arr3[]=new int[size1+size2];
        for(int i=0;i< arr1.length;i++){
            arr3[i]=arr2[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr3[size1]=arr2[i];
            size1++;
        }
        for(int x : arr3) {
            System.out.printf(" "+x);
        }


    }
}
