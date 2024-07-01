package com.interview.java.anagram;

public class Test {

	public static void main(String[] args) {

		String s1 = "cat";
		String s2 = "act";
		
		if(s1.length()==s2.length()) {
			for(int i=0; i<s1.length(); i++) {
				for(int j=0; j<s2.length(); j++) {
					if(s1.charAt(i)==s2.charAt(j)) {
						s2 = s2.replaceFirst(""+s1.charAt(i), ""); // replaceFirst method expects 2 string args but chartAt is char so adding "" to change char to string
						break;
					}
				}
			}
			if(s2.length()==0) {
				System.out.println("Given String is Anagram");
			} else { System.out.println("Not a Anagram");}
		} else {System.out.println("Invalid");}
		
		
		
	}

}
