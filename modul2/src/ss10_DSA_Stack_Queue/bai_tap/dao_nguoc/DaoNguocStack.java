package ss10_DSA_Stack_Queue.bai_tap.dao_nguoc;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(4);
//        stack.push(5);
        for (int i = 0; i < stack.size(); i++) {
            int num = sc.nextInt();
            stack.push(num);
        }



    }
}
