package kr.ac.kopo.javaB.a0927;

import java.util.Scanner;
import java.util.Stack;

public class BOJ9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < a; i++) {
            System.out.println(good(sc.nextLine()));
        }
    }

    public static String good(String a) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else if (stack.empty()) {
                return "NO";
            } else {
                stack.pop();
            }
        }
        
        return stack.empty() ? "YES" : "NO";
    }
}
