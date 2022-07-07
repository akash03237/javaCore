package com.tec.expt;

public class TestExcepstring {
	public static void main(String[] args) {
		String s = "akash";//null bhi le sake he check ke liye
		try {
			System.out.println(s.length());
			System.out.println(s.charAt(3));//this can also be null to chek
		} catch (NullPointerException e) {
			System.out.println("String is blank");
		}catch (RuntimeException e) {
			System.out.println("string is small");//ye char ke liye 
		}
	}

}
