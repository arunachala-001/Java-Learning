package com.interview.java.insertionsort;

public class InsertionSortClass {

	public static void main(String[] args) {

		int[] arr = {3,2,5,1,9,4};
		insertion(arr);
	}

	private static void insertion(int[] arr) {

		for(int i=1; i<arr.length; i++) {
			int temp = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
			
			
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
