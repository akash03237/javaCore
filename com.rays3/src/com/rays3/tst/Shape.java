package com.rays3.tst;

public class Shape {
	private String color = null;
	private int borderWidth = 0;
	private static final double Pi = 3.14;
public int getBroderWidth() {
	return borderWidth;
	
}
		public void setBorderWidth(int bw) {
			borderWidth=bw;
			
		}
	public String getColor() {
		return color;
		
	}
	public void setColor(String color) {
		this.color = color;
	}
	public static double getPi() {
		return Pi;
	}
	}
