package ss1_Introduction_to_Java.bai_tap;

import java.util.Scanner;

public class DoiTienTe {
    public static void main(String[] args) {
        int rate = 23000;
        float usd;
        Scanner chuyen = new Scanner(System.in);
        System.out.println("Nhập vào số USD: ");
        usd = chuyen.nextInt();
        System.out.println("Số tiền chuyển sang VND: " + rate * usd);
    }
}
