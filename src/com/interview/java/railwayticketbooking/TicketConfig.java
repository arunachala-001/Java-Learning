package com.interview.java.railwayticketbooking;
import java.util.*;

public class TicketConfig {

	static int availableLower = 1;
	static int availableMiddle = 1;
	static int availableUpper = 1;
	static int availableRAC = 1;
	static int availableWaitingList = 1;
	
	static List<Integer> bookedList = new ArrayList<>();
	
	static List<Integer> LowerBerthPositions = new ArrayList<>(Arrays.asList(1)); //[1,2,3,4]
	static List<Integer> MiddleBerthPositions = new ArrayList<>(Arrays.asList(1));
	static List<Integer> UpperBerthPositions = new ArrayList<>(Arrays.asList(1));
	
//	static Queue<Integer> RACList = new LinkedList<>();
//	static Queue<Integer> WaitingList = new LinkedList<>();
	static List<Integer> RACList = new ArrayList<>();
	static List<Integer> WaitingList = new ArrayList<>();
	
	static List<Integer> RACPositions = new ArrayList<>(Arrays.asList(1));
	static List<Integer> WaitingListPositions = new ArrayList<>(Arrays.asList(1));
	static Map<Integer,Passenger> passenger = new HashMap<>();
	
	
	public void BookTicket(Passenger p, int number, String berthInfo) {
		p.number = number;
		p.alloted = berthInfo;
		passenger.put(p.passengerId, p);
		
		bookedList.add(p.passengerId);
		System.out.println("Booked Successfully");
		
	}
	
	public void BookRAC(Passenger p, int number, String berthInfo) {
		p.number = number;
		p.alloted = berthInfo;
		passenger.put(p.passengerId, p);
		
		RACList.add(p.passengerId);
		
	}
	
	public void cancelTicket(int id) {
		Passenger p = passenger.get(id);
	    passenger.remove(p.passengerId);
	    if(RACList.size()>0) {
	    	
	    }
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<Tickets Cancelled Successfully >>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}
	public void DisplaybookedTickets() {
		for(Passenger p : passenger.values() ) {
			System.out.println("Passenger ID: "+ p.passengerId);
			System.out.println("Name: "+ p.name);
			System.out.println("Age: "+ p.age);
			System.out.println("Berth Info: "+ p.number+p.alloted);
		}
		
		System.out.println("Total tickets booked "+ passenger.size());
	}
	
	
}
