package com.hTools.mbs;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.*;

public class _RentABikeImpl_Test {
	private RentABikeService rentaBike;
	
	@Before
	public void setUp() {
		rentaBike = new RentABikeImpl("Bruce's Bikes");
	}
	
	@Test
	public void testGetName() {
		assertEquals("Bruce's Bikes", ((RentABikeImpl) rentaBike).getStoreName());
	}
	
	@Test
	public void testGetBike() {
		Bike bike = rentaBike.getBike("11111");
		assertNotNull(bike);
		assertEquals("Shimano", bike.getManufacturer());
	}
	
	@Test 
	public void testGetBikes() {
		List<Bike> bikes = rentaBike.getBikes();
		assertNotNull(bikes);
		assertEquals(3, bikes.size());
	}

}
