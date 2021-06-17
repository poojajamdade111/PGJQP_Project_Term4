package com.niit.dao;

import com.niit.model.Customer;

public interface UserDao {
	
	public boolean registeruser(Customer customer);
	public boolean login(String name,String password);

}
