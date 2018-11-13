package com.steven;

public class MidTickets {
	int price = 1000;
	boolean roundTrip;
	public MidTickets(boolean roundTrip){
		this.roundTrip = roundTrip;
	}
	
	public int getPrice(){
		int total = price;
		if(roundTrip){
			total = (int)(price * 2 * 0.9);
		}
		return total;
	}
}
