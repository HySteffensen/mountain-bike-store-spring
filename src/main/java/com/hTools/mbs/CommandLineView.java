package com.hTools.mbs;

import java.util.Iterator;

public class CommandLineView {
	
	private RentABikeService rentaBike;
	
	public CommandLineView() {}
	
	public void setRentaBike(RentABikeService rentaBike) {
		this.rentaBike = rentaBike;
	}
	
	public RentABikeService getRentaBike() {
		return this.rentaBike;
	}
	
	public void printAllBikes() {
		System.out.println(rentaBike.toString());
		Iterator<Bike> iter = rentaBike.getBikes().iterator();
		while(iter.hasNext()) {
			Bike bike = (Bike)iter.next();
			System.out.println(bike.toString());
		}
	}

}
