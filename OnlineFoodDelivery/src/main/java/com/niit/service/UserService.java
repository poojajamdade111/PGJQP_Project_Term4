package com.niit.service;

import com.niit.model.Customer;

public interface UserService {
	
	public boolean registeruser(Customer customer);
	public boolean login(String name,String password);

}
