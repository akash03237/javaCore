package com.rays3.tst;

public class TestInherit {
public static void main(String[] args) {
	Shape1 s = new Circle(5);
	s.setBorderwidth(56);
	s.setColor("blue");
	System.out.println("border width is"+s.getBorderwidth());
	System.out.println("color is "+s.getColor());
	s.area();
}
}
