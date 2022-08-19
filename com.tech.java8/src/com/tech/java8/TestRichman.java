package com.tech.java8;

public class TestRichman {
	public static void main(String[] args) {
		Richmans a = (c,b) -> {
			System.out.println("addition is: " + (c + b));
	
		};
		a.add(50, 80);

	}

}