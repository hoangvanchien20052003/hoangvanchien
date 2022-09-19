package ss2_Loop_in_Java.bai_tap;

public class SNTNhoHon100 {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            int dem = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    dem++;
                }
            }
            if (dem == 2) {
                System.out.printf(i + " ");
            }
        }
    }
}
