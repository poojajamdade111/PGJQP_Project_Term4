package com.niit.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.OrderDao;
import com.niit.model.FoodOrder;
import com.niit.model.ReservationEntry;

@Repository
@Transactional
public class OrderDaoImpl implements OrderDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public boolean orderfood(FoodOrder foodOrder) {
		try
		{
	
			Session session = sessionFactory.getCurrentSession();
			session.save(foodOrder);
			session.flush();
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}

	public boolean reserveTable(ReservationEntry ReservationEntry) {
		// TODO Auto-generated method stub
		try
		{
	
			Session session = sessionFactory.getCurrentSession();
			session.save(ReservationEntry);
			session.flush();
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}


	public List<FoodOrder> getAllFoodOrder() {
		List<FoodOrder> allFoodOrder=new ArrayList<FoodOrder>();
		try
		{
			Session session = sessionFactory.getCurrentSession();
			allFoodOrder = session.createQuery("from FoodOrder").list();
			return allFoodOrder;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
		
	}

	public List<ReservationEntry> getAllReservationEntry() {
		List<ReservationEntry> allReservationEntry=new ArrayList<ReservationEntry>();
		try
		{
			Session session = sessionFactory.getCurrentSession();
			allReservationEntry = session.createQuery("from ReservationEntry").list();
			return allReservationEntry;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}

	
}
