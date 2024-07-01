//Given an array [input] find the sum of elements present in specified output[input]
//arr[1,2,3,4,5,6,7,8,9,10,11,12,13] gap =3; sample output 35 26 30

package com.interview.java.subarray;

public class Test {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int gap = 3;
		int outputCount = 3;
		
		for(int j = 0; j<outputCount; j++) {
			int sum = 0;
			for(int i=j; i<arr.length; i+=gap) {
				sum = sum+arr[i];
				
			}
			System.out.println(sum);
		}
		
	}

}
