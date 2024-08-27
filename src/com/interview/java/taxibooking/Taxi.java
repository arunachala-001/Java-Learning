package com.interview.java.taxibooking;

import java.util.ArrayList;
import java.util.List;

public class Taxi {

	int taxiId;
	int totalEarnings;
	List<Booking> booking;
	
	public Taxi(int taxiId) {
		this.taxiId = taxiId;
		this.totalEarnings = 0;
		this.booking = new ArrayList<>();
	}
	
//	static List<Booking> bookTaxi = new ArrayList<Booking>();
//	static int availableTaxi = 2;
//	boolean Isavailable = false;
	
	public void addTaxi(Booking b) {
		booking.add(b);  
	    totalEarnings+=b.amount;
	}
}
