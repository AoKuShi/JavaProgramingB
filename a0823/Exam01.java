package kr.ac.kopo.javaB.a0823;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("직사각형의 가로 길이(cm)르 입력하세요 : ");
		double num1 = sc.nextInt();
		System.out.print("직사각형의 세로 길이(cm)를 입력하세요 : ");
		double num2 = sc.nextInt();
		
		System.out.println("직사각형의 넓이는 " + num1*num2 + "cm 입니다.");
		
	}

}
