package com.rays.tec;

public class SecondLargestArray {
	public static void main(String[] args) {
		int[] nums = { 6, 9, 11, 1, 10 };
		int max = Integer.MIN_VALUE;
		int secmax = Integer.MIN_VALUE;
		for (int x = 0; x < nums.length; x++) {
			if (nums[x] > max)  {
				secmax = max;
				max = nums[x];
			} else if (nums[x] > secmax) {
				secmax = nums[x];
			}
		}
		System.out.println("1st H value: " + max);
		System.out.println("2nd H value : " + secmax);
	}

}
