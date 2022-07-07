package com.rays3.tst;

public class TestPolymorphism {
	public static void main(String[] args) {
		double t = 0.0;
		Shape1[] s = new Shape1[3];
		s[0] = new Circle(5);
		s[1] = new Rectangle(10, 20);
		s[2] = new Triangle(20, 20);
		for (int i = 0; i < s.length; i++) {
			t = t + s[i].area();

		}
		System.out.println(t);

	}
}
