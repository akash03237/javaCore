package com.rays5;


public class TestShape {
	
		public static void main(String[] args) {
		double t = 0.0;
			Shape[] s = new Shape [3];
			s[0] = new Circles(5);
			s[1] = new Rectangles(10, 20);
			s[2] = new Triangles(20, 20);
			for (int i = 0; i < s.length; i++) {


				
t = t+s[i].area();


			}
			System.out.println(",..,.,.,.,.,.,.,.,.,.,.,");
			System.out.println("total area is "+t);
			

		}
}
