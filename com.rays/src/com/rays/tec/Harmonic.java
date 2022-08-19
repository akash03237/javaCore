package com.rays.tec;

public class Harmonic {
	public static void main(String[] args) {
		int num = 10;
		double result = 0.0;
		while (num > 0) {

			result = result + (double) 1 / num;

			num--;
		}
		System.out.println("harmonic sereis is" + result);
	}

}
