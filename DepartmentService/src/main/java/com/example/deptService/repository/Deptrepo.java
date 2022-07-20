package com.example.deptService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.deptService.model.Department;

public interface Deptrepo  extends MongoRepository<Department,Integer>
{
	

}
