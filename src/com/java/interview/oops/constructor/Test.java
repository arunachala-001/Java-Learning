package com.java.interview.oops.constructor;

public class Test {

	public static void main(String[] args) {

		ConstructorDemo demo = new ConstructorDemo(10,20);
		int add =demo.getNum1()+demo.getNum2();
		System.out.println(add);
		
		ConstructorDemo demo1 = new ConstructorDemo();
		demo1.setNum2(100);
		System.out.println(demo1.getNum2());
	}

}
