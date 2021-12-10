package com.OnDemandCarWash.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


import com.OnDemandCarWash.model.rating;
import com.OnDemandCarWash.repository.Ratingrepo;



public class Ratings {
	@Autowired
	private Ratingrepo repository;
	
	//To display all review
	@GetMapping("/findAllRating")
	public List<rating> getBooks(){
		return repository.findAll();
	}
}
