package com.hTools.mbs;

public class RentABikeAssembler {
	public static final void main(String[] args) {
		CommandLineView clv = new CommandLineView();
		RentABikeService rentaBike = new RentABikeImpl("Bruce's Bikes");
		clv.setRentaBike(rentaBike);
		clv.printAllBikes();
	}

}
