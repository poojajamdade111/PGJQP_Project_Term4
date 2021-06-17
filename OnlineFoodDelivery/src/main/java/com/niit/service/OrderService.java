package com.niit.service;

import java.util.List;

import com.niit.model.FoodOrder;
import com.niit.model.ReservationEntry;

public interface OrderService {
	
	boolean orderfood(FoodOrder foodOrder);
	boolean reserveTable(ReservationEntry ReservationEntry);
	List<FoodOrder> getAllFoodOrder();
	List<ReservationEntry> getAllReservationEntry();

}
