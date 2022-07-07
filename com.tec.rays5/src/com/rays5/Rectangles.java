package com.rays5;

public class Rectangles extends Shape {
	

	private  int length ;
	private int width;
	public Rectangles() {
		
	}
		public Rectangles (int l , int w) {
			length = l;
			width = w;
		}
	public double area() {
		double area = length*width;
		
		System.out.println("area of rectangle is "+area);
		return area;
	}
	public static void main(String[] args) {
		Shape s = new Rectangles(5,9);
		s.area();
	}
	

}
