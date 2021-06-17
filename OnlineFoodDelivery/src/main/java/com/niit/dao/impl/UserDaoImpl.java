package com.niit.dao.impl;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.UserDao;
import com.niit.model.Admin;
import com.niit.model.Customer;
import com.niit.model.FoodOrder;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public boolean registeruser(Customer customer) {
		try
		{
			Session session = sessionFactory.getCurrentSession();
			session.save(customer);
			session.flush();
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}

	public boolean login(String name, String password) {
		try
		{
			
			Session session = sessionFactory.getCurrentSession();
			Query query=session.createQuery("select c.name,c.password from Admin c  WHERE c.name = :name and c.password = :password");
			query.setParameter("name" ,name);
			query.setParameter("password",password);
			List<Admin> admin=query.list();
			session.flush();
			boolean b=admin.size()!=0;
			return b;
			
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}

}
