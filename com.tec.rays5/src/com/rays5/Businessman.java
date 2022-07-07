package com.rays5;

public  class Businessman implements Richman {

	public void donation() {
		System.out.println("gives donation");

	}

	public void party() {

	}
	public static void main(String[] args) {
		Richman r = new Businessman();
			
			r.donation();
			
		}
	}


