package com.OnDemandCarWash.repository;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.OnDemandCarWash.model.ReviewRate;

public interface Reviewrepo  extends MongoRepository<ReviewRate, Integer> {


}
