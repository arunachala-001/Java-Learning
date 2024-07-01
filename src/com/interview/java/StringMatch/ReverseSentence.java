package com.interview.java.StringMatch;

public class ReverseSentence {

	public static void main(String[] args) {

		String str = "Java is Programming";
		int start=0, end=str.length()-1;
		
		for(int i=str.length()-1; i>=0; i--) {
			if(str.charAt(i) != ' ') {
				continue;
			} else {
				start = i+1;
				reverse(str, start, end);
				end = i-1;
			}
		}
		reverse(str, 0, end);
	}

	private static void reverse(String str, int start, int end) {

		String str2 = "";
		for(int i=start; i<=end; i++) {
			str2 = str2+str.charAt(i);
		}
		str2= str2+ " ";
		System.out.print(str2);
	}

}
