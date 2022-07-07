package com.rays3.tst;

public class Rectangle extends Shape1{
	private  int length ;
	private int width;
	public Rectangle() {
		
	}
		public Rectangle (int l , int w) {
			length = l;
			width = w;
		}
	public double area() {
		double area = length*width;
		
		System.out.println("area of rectangle is "+area);
		return area;
	}
	

}
