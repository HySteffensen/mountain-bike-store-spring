package com.hTools.mbs;

import java.util.Iterator;

public class CommandLineView {
	
	private RentABike rentaBike;
	public CommandLineView() {
		rentaBike = new RentABike("Bruce's Bikes"); 
	}
	
	public void printAllBikes() {
		System.out.println(rentaBike.toString());
		Iterator<Bike> iter = rentaBike.getBikes().iterator();
		while(iter.hasNext()) {
			Bike bike = (Bike)iter.next();
			System.out.println(bike.toString());
		}
	}

	public static final void main(String[] args) {
		CommandLineView clv = new CommandLineView();
		clv.printAllBikes();
	}

}
