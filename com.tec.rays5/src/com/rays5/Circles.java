package com.rays5;


public class Circles extends Shape  {
	
		private  int radius ;
		public Circles() {
			

		}
		public Circles(int r) {
			radius=r;
		}
		public double area() {
			double area = Shape.Pi*radius*radius;
		System.out.println("the area circle is "+area);
		return area;
		}
		public static void main(String[] args) {
			Shape s= new Circles(5);
			s.area();
		}
		}



