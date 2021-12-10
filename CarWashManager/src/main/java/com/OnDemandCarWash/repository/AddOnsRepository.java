package com.OnDemandCarWash.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.OnDemandCarWash.model.AddOns;

public interface AddOnsRepository extends MongoRepository<AddOns,Integer> {

}
