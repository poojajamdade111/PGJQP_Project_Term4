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
@Table(name="ReservationEntry")
public class ReservationEntry implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int reserve_id;
	//@Size(min=3 ,max=50,message="Name must be of size 3 aleast")
	private String name;
	//@NotEmpty(message="The email_id field cannot be empty")
	private String emailid;
	//@NotEmpty(message="The contact number field cannot be empty")
	private String contactno;
//	@NotEmpty(message="The date field cannot be empty")
	private String date;
	//@NotEmpty(message="The time field cannot be empty")
	private String time;
	//@NotEmpty(message="The time field cannot be empty")
	private int numofattendees;
	private String reason;
	private String comments;
	
	public ReservationEntry()
	{
		
	}

	public int getReserve_id() {
		return reserve_id;
	}

	public void setReserve_id(int reserve_id) {
		this.reserve_id = reserve_id;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getNumofattendees() {
		return numofattendees;
	}

	public void setNumofattendees(int numofattendees) {
		this.numofattendees = numofattendees;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
	
	

}
