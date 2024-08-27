package com.interview.java.StringMatch;

public class TrimTest {

	public static void main(String[] args) {

		String str = "      Hello World   ";
		int first=0, last=str.length()-1;
		boolean s=false, l=false;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ' ' && s==false) {
				first++;
			} else if(s == false){ 
				s=true; 
			  }
			
			if(str.charAt(last) == ' ' && l==false) {
				last--;
			} else if(l==false) {
				l=true;
			}
			
			if(s == true && l== true) {
				break;
			}
		}
		for(int i=first; i<=last; i++) {
			System.out.print(str.charAt(i));
		}
		
	}

}
