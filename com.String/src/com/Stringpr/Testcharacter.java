package com.Stringpr;

public class Testcharacter {
	public static void main(String[] args) {

		{
			String input = "aaaaabbccAAdd";
			char search = 'a';
			int count = 0;
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == search)
					count++;
			}
			System.out.println("the character'" + search + "'appears" + count + "times");

		}

	}
}
