package kr.ac.kopo.javaB.a0913;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 반지름 : ");
		double a = sc.nextDouble();
		Circle circle = new Circle(a);

		System.out.printf("반지름이 %.1f인 원의 넓이는 %.2f입니다.", a, circle.circleArea());
	}
	
	final static double PI = 3.14;
	static double r;
	
	public Circle(double a) {
		r = a; 
	}
	
	public double circleArea() {
		return PI * r * r;
	}
}
