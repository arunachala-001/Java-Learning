package com.java.interview.oops.constructor.Inheritence;

public class InheritenceDemo {

	
	public void fibonnaci() {
		int num1 = 0;   // 0 1 [1] [2]
		int num2 = 1;
		System.out.println(num1);
		System.out.println(num2);
		int len = 10;
		int i=0;
		
		while(i<len-2) {
		  int temp = num1+num2;
		  System.out.println(temp);
		  num1 = num2;
		  num2 = temp; 
		  i++;
		  
		}
	}
}
