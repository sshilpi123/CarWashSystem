package com.OnDemandCarWash.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.OnDemandCarWash.model.Customer;
import com.OnDemandCarWash.repository.CustomerRepository;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerRepository repository;
//To Add the customer
	@PostMapping("/addCustomer")
	public int saveBook(@RequestBody Customer customer) {
		repository.save(customer);
		return customer.getId();
	}
	
//To Find Single Customer Details
	@GetMapping("/findSingleCustomer/{id}")
	public Optional<Customer> getCustomer(@PathVariable int id){
		return repository.findById(id);
	}
	
//To Find all Customer Details
	@GetMapping("/findAllCustomers")
	public List<Customer> getBooks(){
		return repository.findAll();
	}
	 
}
