//x=5 y=10 arr[3,4,7,2,9,6,10] find the numbers between x and Y and x should be less than Y.

package com.interview.java.FindNumberOfBetweenTwoNumbersInArray;

public class Test {

	public static void main(String[] args) {

		int x = 3;
		int y = 40;
		int[] arr = {3,4,7,2,9,6,10};
		
		if(x<y) {
			int i = 0;
			while(i<arr.length) {
				if(arr[i]>x && arr[i]<y) {
					System.out.println(arr[i]);
				} 
//				else if(arr[i]<x) {
//					System.out.println("Number Not found in Array");
//					
//				}
				i++;
			}
		} else {
			System.out.println("Invalid Inputs");
		}
	}

}
