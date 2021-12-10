package com.OnDemandCarWash.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnDemandCarWash.model.Customer;
import com.OnDemandCarWash.repository.CustomerRepository;

@Service
public class Cutomerservice {
 @Autowired
 private CustomerRepository repo;
 public  Customer addCustomer(Customer cust) {
	 
		return repo.save(cust);
	} 
 
}
