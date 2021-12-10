package com.OnDemandCarWash.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="Customer")
public class Customer {
	@Id
	private int id;
	@Field
	private String firstName;
	@Field
	private String secondName;
	@Field
	private long contactNo;
	@Field
	private String address;
	@Field 
	private String email;
	@Field 
	private boolean active;

	public Customer(int id, String firstName, String secondName, long contactNo, String address, String email,
			boolean active) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.contactNo = contactNo;
		this.address = address;
		this.email = email;
		this.active = active;
	}
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}

}
