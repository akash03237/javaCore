package com.rays.tec;

import java.util.Scanner;

public class Arnstrong {
	public static void main(String[] args) {
		int num, temp, totalDigit = 0, res = 0, rem;
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the value:");
		num = scan.nextInt();
		temp = num;
		while (num > 0) {
			num /= 10;
			totalDigit++;
		}
		num = temp;
		while (num > 0) {
			rem = num % 10;
			res = res + (int) Math.pow(rem, totalDigit);
			num /= 10;
		}

		if (res == temp)
			System.out.println("Armstrong number");
		else
		System.out.println("Not an armstrong number.");

	}

}
