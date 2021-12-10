package com.OnDemandCarWash.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="Washer")
public class Washer {
	@Id
	private int id;
	@Field
	private String washerName;
	@Field
	private String region;
	@Field 
	private int salary;
	@Field
	private boolean status;
	@Field
	private int washes;
	
	public Washer() {

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWasherName() {
		return washerName;
	}
	public void setWasherName(String washerName) {
		this.washerName = washerName;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getWashes() {
		return washes;
	}
	public void setWashes(int washes) {
		this.washes = washes;
	}
	
}
