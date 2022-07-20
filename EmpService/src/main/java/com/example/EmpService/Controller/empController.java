package com.example.EmpService.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmpService.Model.Emp;
import com.example.EmpService.repository.empRepo;




@RestController
@RequestMapping("/emp")
public class empController
{
	@Autowired
	empRepo repo;
	
	@PostMapping("/save")
	public String save(@RequestBody Emp e )
	{
		repo.save(e);
		return "registred";
	}
	
	@GetMapping("/get")
	public List<Emp> getemp()
	{
	List<Emp> emp=	repo.findAll();
	return emp;
		
	}
	
	@GetMapping("/hello")
	public String hello()
	{
	return "hello";
		
	}
	

}
