package com.rays.tec;

public class Average {

	static int averageEven(int n) {
		if (n % 2 != 0) {
			System.out.println("invalid input");
			return -1;
		}
		int sum = 0, count = 0;
		while (n >= 2) {
			count++;
			sum += n;
			n = n - 2;
		}
		return sum / count;
	}

	public static void main(String[] args) {
		int n = 8;
		System.out.println(averageEven(n));
	}

}
