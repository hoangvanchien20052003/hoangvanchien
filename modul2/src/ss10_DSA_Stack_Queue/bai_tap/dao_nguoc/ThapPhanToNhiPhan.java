package ss10_DSA_Stack_Queue.bai_tap.dao_nguoc;

import java.util.*;
public class ThapPhanToNhiPhan {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Nhập vào số thập phân: ");
        int num = in.nextInt();
        while (num != 0)
        {
            int d = num % 2;
            stack.push(d);
            num /= 2;
        }
        System.out.print("\nGiá trị nhị phân là: ");
        while (!(stack.isEmpty() ))
        {
            System.out.print(stack.pop());
        }

    }
}