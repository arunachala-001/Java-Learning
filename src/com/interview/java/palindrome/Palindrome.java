package com.interview.java.palindrome;

public class Palindrome {
	public static void isPalindrome(String str) {
		int left=0; int right=str.length()-1;
		boolean isPalindrome = false;
		while(left<right) {
			if(str.charAt(left) != str.charAt(right)) {
				isPalindrome = false;
			} else {
				isPalindrome = true;
			}
			left++; 
			right--;
		}
		if(isPalindrome) {
			System.out.println("It is a Palindrome");
		} else { System.out.println("It is not a Palindrome");}
	}

	public static void main(String[] args) {

		String str = "APPA";
		isPalindrome(str);
		
		
	}

}
