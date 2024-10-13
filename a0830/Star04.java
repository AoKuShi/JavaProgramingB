package kr.ac.kopo.javaB.a0830;

import java.util.Scanner;

public class Star04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < num - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
