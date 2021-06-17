package com.niit.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="FoodOrder")
public class FoodOrder implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderid;
	//@Size(min=3 ,max=50,message="Name must be of size 3 aleast")
	private String name;
	//@NotEmpty(message="The email_id field cannot be empty")
	private String emailid;
	//@NotEmpty(message="The contact number field cannot be empty")
	private String contactno;
	//@NotEmpty(message="The Delivery_date field cannot be empty")
	private String deliverydate;
	//@NotEmpty(message="The Delivery_time field cannot be empty")
	private String deliverytime;
	//@NotEmpty(message="The quantity field cannot be empty")
	private String quantity;
	//@NotEmpty(message="The Address field cannot be empty")
	private String address;
	
	public FoodOrder()
	{
		
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getDeliverydate() {
		return deliverydate;
	}

	public void setDeliverydate(String deliverydate) {
		this.deliverydate = deliverydate;
	}

	public String getDeliverytime() {
		return deliverytime;
	}

	public void setDeliverytime(String deliverytime) {
		this.deliverytime = deliverytime;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
	

}
