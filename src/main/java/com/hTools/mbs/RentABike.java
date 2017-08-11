package com.hTools.mbs;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class RentABike {
	
	private String storeName;
	final List<Bike>bikes = new ArrayList<Bike>();
	
	public RentABike(String storeName) {
		bikes.add(new Bike("Shimano", "Roadmaster", 20, "11111", 15, "Fair"));
		bikes.add(new Bike("Cannondale", "F2000 XTR", 18, "22222", 12, "Excellent"));
		bikes.add(new Bike("Trek", "6000", 19, "33333", 12.4, "Fair"));
	}

	@Override
	public String toString() {
		return "RentABike: [storeName=" + storeName + "]";
	}

	public List<Bike> getBikes() {
		return bikes;
	}
	
	public Bike getBike(String serialNo) {
		Iterator<Bike> iter = bikes.iterator();
		while(iter.hasNext()) {
			Bike bike = (Bike)iter.next();
			if(serialNo.equals(bike.getSerialNo())) return bike;
		}
		return null;
	}

	
}
