package com.rays3.tst;

public class Room extends Testpolyset {
	private  int length ;
	private int width;
	public Room() {
		
	}
		public Room(int l , int w) {
			length = l;
			width = w;
		}
	public double area() {
		double area = length*width;
		
		System.out.println("area of room is "+area);
		return area;
	}
}
