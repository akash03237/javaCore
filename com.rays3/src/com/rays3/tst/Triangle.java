package com.rays3.tst;


	public class Triangle extends Shape1{
		private  int height ;
		private int breadth;
		public Triangle() {
			
		}
			public Triangle (int h , int b) {
				height = h;
				breadth = b;
			}
		public double area() {
			double area = 0.5
					*height*breadth;
			System.out.println("area of triangle is "+area);
			return area;
		}
		

	}


