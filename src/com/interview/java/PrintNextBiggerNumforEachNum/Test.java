//From a given array of integers print the next bigger number for each number in the array.
//[4,5,30,3] output = 4->4, 5->30, 30->, 3->4 

package com.interview.java.PrintNextBiggerNumforEachNum;

public class Test {

	public static void main(String[] args) {

		int num[] = {4,5,30,3};
		
		for(int i=0; i<num.length;i++) {
			int big = Integer.MAX_VALUE;
			for(int j=0; j<num.length; j++) {
				if(num[i]<num[j]) {
					if(big>num[j]) {
						big = num[j];
					}	
				}
			}
			if(big != Integer.MAX_VALUE) {
				System.out.print(num[i]+"->"+big+",");
			} else {System.out.print(num[i]+"->,");}
		}
	}

}
