package com.interview.java.taxibooking;

public class Booking {

	int id=1;
	int customerID;
	int bookingID;
	String from;
	String to;
	int pickupTime;
	int dropTime;
	int amount;
	
	public Booking(int customerID, int BookingID, String from, String to, int pickuptime, int dropTime, int amount) {
		this.customerID = id++;
		this.bookingID = id++;
		this.from = from;
		this.to = to;
		this.pickupTime = pickupTime;
		this.dropTime = dropTime;
		this.amount = amount;
	}
}
