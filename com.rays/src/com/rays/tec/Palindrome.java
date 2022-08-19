package com.rays.tec;

public class Palindrome {
	public static void main(String[] args) {

		int r, sum = 0, temp;
		int n = 454;
		temp = n;
		while (temp != 0) {
			r = temp % 10;
			sum = (sum * 10) + r;
			temp = temp / 10;
		}
		if (n == sum)
			System.out.println(n + " palindrome number");
		else
			System.out.println(n + " not palindrome");

	}
}