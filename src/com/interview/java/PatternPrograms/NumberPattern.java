package com.interview.java.PatternPrograms;

public class NumberPattern {

	public static void main(String[] args) {

		int len = 5;
		numberPattern(len);
	}

	private static void numberPattern(int len) {

		for(int i =1; i<=len; i++) {
			for(int j=1; j<=len-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}
	}

}
