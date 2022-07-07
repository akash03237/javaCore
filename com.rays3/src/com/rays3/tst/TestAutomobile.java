package com.rays3.tst;

public class TestAutomobile {
	public static void main(String[] args) {
		Automobile x = new Automobile();
		x.setColor("your car color is blue");
		x.setMake("make is hyundai");
		x.setSpeed("top speed is 100");
		System.out.println(x.getColor());
		System.out.println(x.getMake());
		System.out.println(x.getSpeed());
		System.out.println(x.getGears());

	}
}
