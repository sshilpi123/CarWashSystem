package com.OnDemandCarWash.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.OnDemandCarWash.model.ReviewRate;


import com.OnDemandCarWash.repository.Reviewrepo;

public class ReviewController {
	@Autowired
	private Reviewrepo repository;
	
	//To display all review
		@PostMapping("/addReview")
		public int saveBook(@RequestBody  ReviewRate review) {
			repository.save(review);
			return review.getId();
		}
}
