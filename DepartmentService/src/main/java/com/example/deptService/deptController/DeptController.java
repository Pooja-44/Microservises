package com.example.deptService.deptController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.deptService.model.Department;
import com.example.deptService.repository.Deptrepo;

@RestController
@RequestMapping("/dept")
public class DeptController 
{
	@Autowired
	Deptrepo repo;

	@PostMapping("/save")
	public String save(@RequestBody Department d )
	{
		repo.save(d);
		return "registred";
	}	
	
	@GetMapping("/get")
	public List<Department> getdept()
	{
		List<Department> dept=repo.findAll();
		return dept;
	}
}
