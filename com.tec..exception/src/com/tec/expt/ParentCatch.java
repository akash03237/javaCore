package com.tec.expt;

public class ParentCatch {
	public static void main(String[] args) {
		String name = "akash";
		try {
			System.out.println("length of name is" + name.length());
			System.out.println("character at 4th position is " + name.charAt(10));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("string is small");
		} catch (RuntimeException e) {
			System.out.println("good name");
		} finally {
			System.out.println("i am indian");
		}
	}

}
