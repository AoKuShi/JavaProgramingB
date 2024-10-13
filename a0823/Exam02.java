package kr.ac.kopo.javaB.a0823;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("변수 a의 값(정수)을 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("변수 b의 값(정수)을 입력하세요 : ");
		int num2 = sc.nextInt();
		
		int num3 = num1;
		num1 = num2;
		num2 = num3;
		System.out.println("<스왑 결과>");
		System.out.println("a = " + num1 + ", b = " + num2);
	}

}
