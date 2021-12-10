package com.OnDemandCarWash.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.OnDemandCarWash.model.CarWashService;

public interface CarWashServiceRepository extends MongoRepository<CarWashService,Integer>{

}
