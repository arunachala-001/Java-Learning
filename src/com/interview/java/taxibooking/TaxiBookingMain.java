package com.interview.java.taxibooking;
import java.util.*;

public class TaxiBookingMain {
	List<Taxi> taxis;
	int bookingCounter;
	
	public TaxiBookingMain(int numOfTaxi) {
		for(int i=1; i<=numOfTaxi; i++) {
			taxis = new ArrayList<>();
			taxis.add(new Taxi(i));
		}
		bookingCounter = 1;
	}
	
	public static void bookTaxi(String pickupPoint, String dropPoint, int pickupTime) {
		int distance = Math.abs(dropPoint.charAt(0) - pickupPoint.charAt(0))*15;
		int dropTime = pickupTime+(distance/15);
		int amount = CalculateAmount(distance);
		
		
		
	
	}
	public static int CalculateAmount(int distance) {
		if(distance<=15) {
			return 100;
		}
		return 100+(distance-5)*10;
	}

	public static void main(String[] args) {
        TaxiBookingMain taxiBooking = new TaxiBookingMain(2);
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while(loop) { 
			System.out.println("\n 1.Book Taxi \n 2.Display Taxi Details \n 3.Exit");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the pickup point: ");
				String pickupPoint = sc.next();
				System.out.println("Enter the Drop point: ");
				String dropPoint = sc.next();
				System.out.println("Enter the pickup time: ");
				int pickupTime = sc.nextInt();
				bookTaxi(pickupPoint, dropPoint, pickupTime);
				
				
			}
		}
	}

}
