package kr.ac.kopo.javaB.a0920;

public class Circle {
	final static double PI = 3.14;
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * PI;
	}
}
