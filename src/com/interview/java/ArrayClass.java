package com.interview.java;

public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10,3,7,2,9};
		int temp = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		
			System.out.println(arr[2]);
	
	
	}

}
