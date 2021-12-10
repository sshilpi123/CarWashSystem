package com.OnDemandCarWash.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.OnDemandCarWash.model.ContactUs;
import com.OnDemandCarWash.repository.ContactUsRepository;

@RestController
public class ContactUsController {
	
	@Autowired
	private ContactUsRepository repository;
	
//To Add/Edit the Contact details
	@PostMapping("/editContactUs")
	public int saveBook(@RequestBody ContactUs contactUs) {
		repository.save(contactUs);
		return contactUs.getId();
	}
	
//To find/display the contact details
	@GetMapping("/contactUs")
	public List<ContactUs> getBook() {
		return repository.findAll();
	}
}
