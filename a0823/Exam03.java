package kr.ac.kopo.javaB.a0823;

import java.util.Scanner;

public class Exam03 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final double P = 3.14;
		
		System.out.print("원의 반지름(cm)을 입력하세요 : ");
		double num1 = sc.nextInt();
		
		System.out.println("원의 넓이는 " + num1*num1*P + "cm² 입니다.");

	}

}
