package com.interview.java.StringMatch;

public class StringMatch {

	public static void main(String[] args) {

		String str = "Hello Welcome To My Java World";
		String str1 = "Welcome";
//		System.out.println(str.charAt(0));
		
		boolean isMatch = false;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == str1.charAt(0)) {
				int count =0;
				for(int j=0; j<str1.length(); j++ ) {
					if(str1.charAt(j) == str.charAt(i)) {
						count++;
						i++;
					}
				}
				if(count==str1.length()) {
					isMatch = true;
				} else { isMatch = false;}
			}
		}
		if(isMatch) {
			System.out.println(str1+ " is Matched");
		} else {System.out.println(str1+ " is Not Found");}
		
		
	}

}
