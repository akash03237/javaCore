package com.rays2;

import java.util.Arrays;
 
public class TestMissingEle {
	public static int getMissingNumber(int[] arr) {
		int n = arr.length;
		int m = n + 1;
		int total = m * (m + 1) / 2;
		int sum = Arrays.stream(arr).sum();
		return total - sum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4,5, 6, 7, 8, 9, 10,11 };
		int[] arr1= {1,2,3,4,6,7,8,9,10};
		System.out.println("the missing element is " + getMissingNumber(arr));
		System.out.println("the missing element is "+ getMissingNumber(arr1));
	}
}
