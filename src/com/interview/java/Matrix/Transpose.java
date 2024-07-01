package com.interview.java.Matrix;

public class Transpose {

	public static void main(String[] args) {

		int[][] arr = {{1,2,3},
				       {4,5,6},
				       {7,8,9}};
		int[][] transpose = new int[3][3];
		System.out.println("Before Transpose");
		
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr.length; col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
		
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr.length; col++) {
				transpose[row][col] = arr[col][row];
			}
		}
		System.out.println("After Transpose");
		for(int row=0; row<transpose.length; row++) {
			for(int col=0; col<transpose.length; col++) {
				System.out.print(transpose[row][col]+" ");
			}
			System.out.println();
		}
	}

}
