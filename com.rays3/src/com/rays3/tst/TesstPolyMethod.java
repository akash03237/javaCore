package com.rays3.tst;

public class TesstPolyMethod {
	public static void main(String[] args) {
		Shape1[] s = new Shape1[3];
		s[0] = new Rectangle(10,20);
		s[1] = new Circle(5);
		s[2] = new Triangle(10,20);
		double totalArea = calcArea(s);
		System.out.println(totalArea);

	}

	private static double calcArea(Shape1[] s) {
		double totalArea = 0;
		for (int i = 0; i < s.length; i++) {
			totalArea += s[i].area();
		}

		return totalArea;
	}
}
/*the method overriding is an example of runtime polymorphism*/
