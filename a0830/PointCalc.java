package kr.ac.kopo.javaB.a0830;

import java.util.Scanner;

public class PointCalc {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int numStudent = getNumberKeyboard("학생 수 : ");
		int[] scores = getScoresLine(numStudent);
		printSumAverage(scores);
	}

	private static void printSumAverage(int[] scores) {
		int a = scores.length;
		int sum = 0;
		for (int i = 0; i < a; i++) {
			sum += scores[i];
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum/a);
	}

	private static int[] getScoresLine(int numStudent) {
		int[] arr1 = new int[numStudent];
		System.out.print(numStudent + "명의 성적 : ");
		for (int i = 0; i < numStudent; i++) {
			arr1[i] = sc.nextInt();
		}
		return arr1;
	}

	private static int getNumberKeyboard(String msg) {
		System.out.println(msg);
		return sc.nextInt();
	}
	
}
