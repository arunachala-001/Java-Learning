package com.interview.java.Matrix;

public class MatrixMultiplication {

	public static void main(String[] args) {

		int[][] a = {{1,2,3},
				     {4,5,6},
				     {7,8,9}};
		
		int[][] b = {{1,2,3},
			         {4,5,6},
			         {7,8,9}};
		int[][] c = new int[3][3];
		
		for(int row=0; row<3; row++) {
			for(int col=0; col<3; col++) {
				c[row][col] = 0;	
				for(int k=0; k<3; k++) {
					c[row][col] += a[row][k]*b[k][col];
				}
			}
			
		}
		for(int row=0; row<3; row++) {
			for(int col=0; col<3; col++) {
				System.out.print(c[row][col]+ " ");
			}
			System.out.println();
		}
		
	}

}
