package com.steven;

import java.util.Scanner;

public class Midterm {

	public static void main(String[] args) {
		MidTickets ticket = new MidTickets(false);
		MidTickets roundTicket = new MidTickets(true);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter number of tickets:");
		int numOfTic = scanner.nextInt();
		System.out.print("How many rount-trip tickets:");
		int rTrip = scanner.nextInt();
		System.out.println("Total tickets:  " + numOfTic);
		System.out.println("Round-trip:  " + rTrip);
		int total = (numOfTic-rTrip)*ticket.getPrice() + 
				roundTicket.getPrice()*rTrip;
		System.out.println("Total: "  + total);
	}

}
