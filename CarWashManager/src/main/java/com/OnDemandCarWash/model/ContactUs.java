package com.OnDemandCarWash.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="ContactUs")
public class ContactUs {
	
	@Id
	private int id;
	@Field
	private long phone1;
	@Field
	private long phone2;
	@Field 
	private String email;
	@Field
	private String address;
	
	public ContactUs() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getPhone1() {
		return phone1;
	}

	public void setPhone1(long phone1) {
		this.phone1 = phone1;
	}

	public long getPhone2() {
		return phone2;
	}

	public void setPhone2(long phone2) {
		this.phone2 = phone2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
