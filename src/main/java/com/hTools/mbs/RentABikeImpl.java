package com.hTools.mbs;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class RentABikeImpl implements RentABikeService {
	
	private String storeName;
	final List<Bike>bikes = new ArrayList<Bike>();
	
	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	
	private void initBikes() {
		bikes.add(new Bike("Shimano", "Roadmaster", 20, "11111", 15, "Fair"));
		bikes.add(new Bike("Cannondale", "F2000 XTR", 18, "22222", 12, "Excellent"));
		bikes.add(new Bike("Trek", "6000", 19, "33333", 12.4, "Fair"));
	}

	public RentABikeImpl() {
		initBikes();
	}
	
	public RentABikeImpl(String storeName) {
		this.storeName = storeName;
		initBikes();
	}

	@Override
	public String toString() {
		return "RentABike: [storeName=" + storeName + "]";
	}

	/* (non-Javadoc)
	 * @see com.hTools.mbs.RentABikeService#getBikes()
	 */
	public List<Bike> getBikes() {
		return bikes;
	}
	
	/* (non-Javadoc)
	 * @see com.hTools.mbs.RentABikeService#getBike(java.lang.String)
	 */
	public Bike getBike(String serialNo) {
		Iterator<Bike> iter = bikes.iterator();
		while(iter.hasNext()) {
			Bike bike = (Bike)iter.next();
			if(serialNo.equals(bike.getSerialNo())) return bike;
		}
		return null;
	}

	
}
