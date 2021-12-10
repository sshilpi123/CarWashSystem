package com.OnDemandCarWash.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.OnDemandCarWash.model.ContactUs;

public interface ContactUsRepository extends MongoRepository<ContactUs, Integer> {

}
