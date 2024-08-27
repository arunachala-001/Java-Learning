package com.interview.java.insertionsort;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = {30,7,25,90,3};
//		System.out.println(arr.length);
		
		for(int i=0; i<arr.length; i++) {
			int min_idx= i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[min_idx]) {
					min_idx = j;					
				}
				
			}
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
			
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
