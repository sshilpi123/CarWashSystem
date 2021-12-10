package com.OnDemandCarWash.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.OnDemandCarWash.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, Integer> {

}
