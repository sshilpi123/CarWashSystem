package com.OnDemandCarWash.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.OnDemandCarWash.model.rating;

public interface Ratingrepo extends MongoRepository<rating, Integer> {



}
