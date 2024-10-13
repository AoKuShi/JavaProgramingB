package kr.ac.kopo.javaB.a0823;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("변수 a와 b값(정수)을 차례대로 입력하세요 : ");
		displaySwap(swapInt(sc.nextInt(), sc.nextInt()));
	}
	
	public static int[] swapInt(int a, int b) {
		int[] arr1 = {a, b};
		int c = arr1[0]; 
		arr1[0] = arr1[1];
		arr1[1] = c;
		
		return arr1;
	}
	
	public static void displaySwap(int[] arr2) {
		System.out.println("<스왑 결과>");
		System.out.println("a = " + arr2[0] + ", b = " + arr2[1]);
	}

}