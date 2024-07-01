package com.interview.java.palindrome;

public class PalindromNum {

	public static void main(String[] args) {

		int num = 434;
		int sum=0;
		int temp = num;
		
		while(num>0) {
			int reminder = 	num%10;
			sum = (sum*10)+reminder;
			num = num/10;
			
		}
		if(temp == sum) {
			System.out.println("Yes");
		} else { System.out.println("No"); }
	}

}
