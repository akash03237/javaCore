package com.rays3.tst;

public class TestGetter {
	public static void main(String[] args) {
		Shape s;
		s = new Shape();
		s.setColor("black");
		s.setBorderWidth(50);
		int borderW = s.getBroderWidth();
		System.out.println(borderW);
		String color = s.getColor();
		System.out.println(color);
		
	}
}
