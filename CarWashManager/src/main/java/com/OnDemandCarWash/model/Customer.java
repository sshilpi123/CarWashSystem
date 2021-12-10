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
	private int contactNo;
	@Field
	private String address;
	@Field 
	private String email;
	@Field 
	private boolean active;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
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
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Customer(int id, String firstName, String secondName, int contactNo, String address, String email,
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
		
		// TODO Auto-generated constructor stub
	}
	
	
}
