package com.OnDemandCarWash.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class ContactUs {
	@Field
	private String Name;
	@Field
	private long contactNo;
	@Field 
	private String email;
	@Field 
	private String ServiceDescr;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getServiceDescr() {
		return ServiceDescr;
	}
	public void setServiceDescr(String serviceDescr) {
		ServiceDescr = serviceDescr;
	}
	public ContactUs(String name, long contactNo, String email, String serviceDescr) {
		super();
		Name = name;
		this.contactNo = contactNo;
		this.email = email;
		ServiceDescr = serviceDescr;
	}
	public ContactUs() {
		
	}





}
