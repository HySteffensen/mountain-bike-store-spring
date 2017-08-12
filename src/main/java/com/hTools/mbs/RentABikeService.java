package com.hTools.mbs;

import java.util.List;

public interface RentABikeService {

	List<Bike> getBikes();

	Bike getBike(String serialNo);

}