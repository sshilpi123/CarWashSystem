package com.OnDemandCarWash.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.OnDemandCarWash.model.AddOns;
import com.OnDemandCarWash.repository.AddOnsRepository;

//To Manage AddOnsSerive

@RestController
public class AddOnsController {
	
	@Autowired
	private AddOnsRepository repository;
	
//To Add the AddOn Services
	@PostMapping("/addAddOns")
	public int saveBook(@RequestBody AddOns addOns) {
		repository.save(addOns);
		return addOns.getId();
	}
//To Delete the AddOn Services
	@DeleteMapping("/deleteAddOns/{id}")
	public String deleteAddOns(@PathVariable int id) {
		repository.deleteById(id);
		return "AddOn is deleted with id: "+id;
	}
//To find all the AddOns service
	@GetMapping("/findAllAddOns")
	public List<AddOns> getBooks(){
		return repository.findAll();
	}
}
