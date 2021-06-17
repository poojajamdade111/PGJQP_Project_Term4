package com.niit.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.UserDao;
import com.niit.model.Customer;
import com.niit.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userServiceDao;
	
	
	public boolean registeruser(Customer customer) {
		return userServiceDao.registeruser(customer);
	}


	public boolean login(String name, String password) {
		// TODO Auto-generated method stub
		return  userServiceDao.login(name,password);
	}

}
