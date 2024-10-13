package kr.ac.kopo.javaB.a0920;

public class Ball extends Circle {

	public Ball(double radius) {
		super(radius);
	}

	@Override
	public double getArea() {
		return 4 * PI * super.getRadius();
	}

}
