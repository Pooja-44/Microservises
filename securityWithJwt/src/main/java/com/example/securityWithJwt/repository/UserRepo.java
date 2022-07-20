package com.example.securityWithJwt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.securityWithJwt.Entity.User;

public interface UserRepo  extends MongoRepository<User,Integer>{

	User findByUserName(String username);

}