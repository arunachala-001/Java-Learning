package com.interview.java.railwayticketbooking;

public class Passenger {
    static int id =1;
	int passengerId;
	String name;
	int age;
	String gender;
	String berthPreference;
	String alloted;
	int number;
	boolean hasChildren;
	
	
	public Passenger(String name, int age, String gender, String berthPreference,boolean hasChildren) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.berthPreference = berthPreference;
		this.passengerId = id++;
		this.hasChildren = hasChildren;
		alloted = "";
		number = -1;
	}
	
	
}
