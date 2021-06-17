package com.niit.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer implements Serializable{
        
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int cust_id;
		private String name;
		private String password;
		private String email;
		
		public Customer()
		{
			
		}

		public int getCust_id() {
			return cust_id;
		}
	
		public void setCust_id(int cust_id) {
			this.cust_id = cust_id;
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
	
		public String getEmail() {
			return email;
		}
	
		public void setEmail(String email) {
			this.email = email;
		}
}
