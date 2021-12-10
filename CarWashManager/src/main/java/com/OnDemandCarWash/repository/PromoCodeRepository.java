package com.OnDemandCarWash.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.OnDemandCarWash.model.PromoCode;

public interface PromoCodeRepository extends MongoRepository<PromoCode,Integer> {

}
