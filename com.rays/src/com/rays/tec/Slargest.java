package com.rays.tec;

import java.util.Arrays;

public class Slargest {
public static void printSecondLargestUsingSorting(int[]arr){
	
	
	
	if(arr.length<2) {
		System.out.println("second largest element does not exist:");
	return;
	}
	
	Arrays.sort(arr);
	int largest=Integer.MIN_VALUE;
	int secondLargest=Integer.MIN_VALUE;
	for(int i = 0 ; i<arr.length;i++) {
		if (arr[i]>largest) {
			secondLargest=largest;
			largest=arr[i];
		}
		if (arr[i]!=largest && arr[i]>secondLargest) {
		secondLargest=arr[i];	
		}
	}
	if (secondLargest==Integer.MIN_VALUE) {
		System.out.println("second largest element does not exist:");
	}else {
		System.out.println("Second largest"+secondLargest);
			
		}
		

}
}




