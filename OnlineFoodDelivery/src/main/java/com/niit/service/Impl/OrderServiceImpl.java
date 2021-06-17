package com.niit.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.niit.dao.OrderDao;
import com.niit.model.FoodOrder;
import com.niit.model.ReservationEntry;
import com.niit.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderDao orderDao;
	
	public boolean orderfood(FoodOrder foodOrder)
	{
	return orderDao.orderfood(foodOrder);	
	}

	public boolean reserveTable(ReservationEntry ReservationEntry)
	{
		return orderDao.reserveTable(ReservationEntry);
	}


	public List<FoodOrder> getAllFoodOrder() {
		
		return orderDao.getAllFoodOrder();
	}

	public List<ReservationEntry> getAllReservationEntry() {
		return orderDao.getAllReservationEntry();
	}

}
