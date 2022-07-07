package com.rays3.tst;

public class Automobile {
	private String color;
	private String speed;
	private String make;
	private static final int GEARS = 5;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public static int getGears() {
		return GEARS;
	}

}
