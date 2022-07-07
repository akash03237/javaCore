package com.rays5;

public class Triangles extends Shape {
	private int height;
	private int breadth;

	public Triangles() {

	}

	public Triangles(int h, int b) {
		height = h;
		breadth = b;
	}

	public double area() {
		double area = 0.5 * height * breadth;
		System.out.println("area of triangle is " + area);
		return area;
	}

	public static void main(String[] args) {
		Shape s = new Triangles(5, 4);
		s.area();
	}
}
