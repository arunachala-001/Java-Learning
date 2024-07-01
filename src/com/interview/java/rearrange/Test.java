//Given an array of integers, rearrange the array such that every second element of the array is greater than its left
//and right elements. Assume no duplicates

package com.interview.java.rearrange;

public class Test {

	public static void sort(int[] arr) {
		int temp =0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
			
		}
		
	}
	public static void main(String[] args) {
        int arr[] = {7,6,4,5,1,3,2};
        sort(arr);
         //[1,2,3,4,5,6,7]
        int temp =0;
        for(int i=1; i<arr.length; i=i+2) {
        	temp = arr[i];
        	arr[i] = arr[i+1];
        	arr[i+1] = temp;
        }
        
        
        for(int i=0; i<arr.length; i++) {
        	System.out.println(arr[i]);
        }
		
	}

}
