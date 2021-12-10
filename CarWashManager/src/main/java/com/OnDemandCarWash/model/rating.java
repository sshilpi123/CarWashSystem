package com.OnDemandCarWash.model;

import org.springframework.data.annotation.Id;

public class rating {
	@Id
	int id;
    String washerName;
    int rating;
    String review;
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
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public rating(int id, String washerName, int rating, String review) {
		super();
		this.id = id;
		this.washerName = washerName;
		this.rating = rating;
		this.review = review;
	}
	public rating() {
		
	}
	@Override
	public String toString() {
		return "Review [id=" + id + ", washerName=" + washerName + ", rating=" + rating + ", review=" + review + "]";
	}
}
