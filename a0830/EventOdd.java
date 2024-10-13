package kr.ac.kopo.javaB.a0830;

import java.util.Scanner;

public class EventOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			int a = sc.nextInt();
			if(a%2 == 0) {
				System.out.println(">> 짝수입니다");
			} else {
				System.out.println(">> 홀수입니다");
			}
			System.out.println("계속 하시겠습니까? (0 -> 멈춤|1 -> 계속)");
			if(sc.nextInt() == 0) break;
		}
	}
}
