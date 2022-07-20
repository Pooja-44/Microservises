package com.example.locService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.locService.model.Location;

public interface Locationrepo extends MongoRepository<Location ,Integer> {

}
