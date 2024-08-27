package com.interview.java.railwayticketbooking;
import com.interview.java.railwayticketbooking.Passenger;

import java.util.List;
import java.util.Scanner;

public class TicketBookingMain {
	
	static void bookTicket(Passenger p) {
		TicketConfig ticketConfig = new TicketConfig();
		
		if(ticketConfig.availableWaitingList==0) {
			System.out.println("No Tickets Available");
			return;
		} 
		
		if(p.age>=60 && ticketConfig.availableLower>0 ||
				p.hasChildren && ticketConfig.availableLower>0) {
			System.out.println("Lower Birth given____________________________>>>>>");
			ticketConfig.BookTicket(p, ticketConfig.LowerBerthPositions.get(0), "L");
			ticketConfig.LowerBerthPositions.remove(0);
			ticketConfig.availableLower--;
			
		} else if(p.berthPreference.equals("L") && ticketConfig.availableLower>0 ||
				p.berthPreference.equals("M") && ticketConfig.availableMiddle>0 ||
				p.berthPreference.equals("U") && ticketConfig.availableUpper>0) {
			
			if(p.berthPreference.equals("L")) {
				System.out.println("Lower Birth given____________________________>>>>>");
				ticketConfig.BookTicket(p, ticketConfig.LowerBerthPositions.get(0), "L");
				ticketConfig.LowerBerthPositions.remove(0);
				ticketConfig.availableLower--;	
			} else if(p.berthPreference.equals("M")) {
				System.out.println("Middle Birth given____________________________>>>>>");
				ticketConfig.BookTicket(p, ticketConfig.MiddleBerthPositions.get(0), "M");
				ticketConfig.MiddleBerthPositions.remove(0);
				ticketConfig.availableMiddle--;	
			}
			else if(p.berthPreference.equals("U")) {
				System.out.println("Middle Birth given____________________________>>>>>");
				ticketConfig.BookTicket(p, ticketConfig.UpperBerthPositions.get(0), "U");
				ticketConfig.UpperBerthPositions.remove(0);
				ticketConfig.availableUpper--;	
			}
		} else if(ticketConfig.availableLower>0) {
			System.out.println("Lower Birth given____________________________>>>>>");
			ticketConfig.BookTicket(p, ticketConfig.LowerBerthPositions.get(0), "L");
			ticketConfig.LowerBerthPositions.remove(0);
			ticketConfig.availableLower--;
		}
		else if(ticketConfig.availableMiddle>0) {
			System.out.println("Middle Birth given____________________________>>>>>");
			ticketConfig.BookTicket(p, ticketConfig.MiddleBerthPositions.get(0), "M");
			ticketConfig.MiddleBerthPositions.remove(0);
			ticketConfig.availableMiddle--;
		}
		else if(ticketConfig.availableUpper>0) {
			System.out.println("Upper Birth given____________________________>>>>>");
			ticketConfig.BookTicket(p, ticketConfig.UpperBerthPositions.get(0), "U");
			ticketConfig.UpperBerthPositions.remove(0);
			ticketConfig.availableUpper--;
		}
		else if(ticketConfig.availableRAC>0) {
			System.out.println("RAC given____________________________>>>>>");
			ticketConfig.BookRAC(p, ticketConfig.RACPositions.get(0), "RAC");
			ticketConfig.RACPositions.remove(0);
			ticketConfig.availableRAC--;
		}
		else if(ticketConfig.availableWaitingList>0) {
			System.out.println("RAC given____________________________>>>>>");
			ticketConfig.BookTicket(p, ticketConfig.WaitingListPositions.get(0), "WL");
			ticketConfig.WaitingListPositions.remove(0);
			ticketConfig.availableWaitingList--;
		}
			
		
		
	}
	

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		boolean loop = true;
		while(loop) {
			System.out.println("\n 1.Book Ticket \n 2.Cancel Ticket \n 3.Available Tickets \n 4.Booked Tickets \n 5.Exit");
			System.out.println("Enter Your choice (1 or 2 or 3) :");
			int choice = in.nextInt();
//			System.out.println("your choice is "+choice);
			
			switch(choice) {
			case 1:
				System.out.println("Enter your Name, Age, Gender and Berth Preference:");
				String name = in.next();
				int age = in.nextInt();
				String gender = in.next();
				String berthPreference = in.next();
				boolean hasChildren = false;
				if(gender.equals("Female")) {
					System.out.println("has Children?");
					hasChildren = in.nextBoolean();
				} 
				Passenger p = new Passenger(name,age,gender,berthPreference,hasChildren);
				bookTicket(p);
				break;
				
			case 2:
				System.out.println("Enter the Passenger ID: ");
				int id = in.nextInt();
				TicketConfig tc = new TicketConfig();
				tc.cancelTicket(id);
			
			case 4:
				TicketConfig t = new TicketConfig();
				t.DisplaybookedTickets();
			}
			
		}
		
		
		
		
		
	}

}
