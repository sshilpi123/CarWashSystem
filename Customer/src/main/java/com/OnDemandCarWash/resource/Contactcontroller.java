package com.OnDemandCarWash.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.OnDemandCarWash.model.ContactUs;
import com.OnDemandCarWash.repository.Contact;


@RestController
public class Contactcontroller {
	@Autowired
	private Contact repository;
	
	@PostMapping("/addContact")
	public String saveBook(@RequestBody ContactUs contactUs) {
		repository.save(contactUs);
		return contactUs.getName();
		
	}
}
