package com.interview.java;

import java.util.Arrays;

public class Testing {
	 public void merge(int[] nums1, int m, int[] nums2, int n) {
	        int index=0;
	        for(int i=0; i<nums1.length; i++) {
	           if(nums1[i] != 0) {
	            nums1[index] = nums1[i];
	           }
	           index++;
	        }

	        for(int i=0; i<n; i++) {
	            nums1[m++] = nums2[i];
	        }
	        Arrays.sort(nums1);
	        
	        for(int i=0; i<m; i++) {
	            System.out.println(nums1[i]);
	        }
	 }
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        Testing sol = new Testing();
        sol.merge(nums1, m, nums2, n);
	}

}
