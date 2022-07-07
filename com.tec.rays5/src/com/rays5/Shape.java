package com.rays5;

public abstract class Shape {
	private String color;
	private int borderwidth;
	public static final double Pi = 3.14;
	
	public Shape() {
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBorderwidth() {
		return borderwidth;
	}

	public void setBorderwidth(int i) {
		this.borderwidth = i;
	}

	public abstract double area();

	
}
