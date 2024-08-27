package com.interview.java.PatternPrograms;

public class StarDiamondPattern {

	public static void main(String[] args) {

		int len = 20;
		
		for(int i=1; i<=len; i++) {
			for(int j=1; j<=len-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=len-1; i>=0; i--) {
			for(int j=1; j<=len-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
