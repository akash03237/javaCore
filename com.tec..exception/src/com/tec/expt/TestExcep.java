package com.tec.expt;

public class TestExcep {
	public static void main(String[] args) {

		try {
			double div = 15 / 0;
			System.out.println(div);
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("i am finally");
		}
	}
}
