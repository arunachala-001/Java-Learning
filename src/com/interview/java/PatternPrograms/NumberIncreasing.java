package com.interview.java.PatternPrograms;

public class NumberIncreasing {

	public static void main(String[] args) {

		int len = 5;
		numberIncreasing(len);
		System.out.println("_____________________________________________________");
		numberReverse(len);
	}

	private static void numberReverse(int len) {

		for(int i=len; i>=0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}

	private static void numberIncreasing(int len) {

		for(int i=1; i<=len; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
		
	}

}
