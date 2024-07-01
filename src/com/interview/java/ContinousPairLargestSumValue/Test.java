// Find the Largest Sum Value in Continuous pair .

package com.interview.java.ContinousPairLargestSumValue;

public class Test {

	public static void main(String[] args) {
		int[] arr = {1,2,10,22,5,9,16};
		int sum = 0;
		int big = 0;
		
		
		for(int i =0; i<arr.length-1; i++) {
			sum = arr[i]+arr[i+1];
			
			if(sum>big) {
				big = sum;
			}
		}
		System.out.println("Largest Value is "+big);
		
	}

}
