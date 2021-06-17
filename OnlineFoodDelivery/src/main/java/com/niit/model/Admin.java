package com.niit.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Admin_id;
	private String name;
	private String password;
	
	Admin()
	{
		
	}

	public int getAdmin_id() {
		return Admin_id;
	}

	public void setAdmin_id(int admin_id) {
		Admin_id = admin_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	

}
