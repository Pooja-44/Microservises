package com.example.HrService.controller;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.HrService.model.AuthRequest;
import com.example.HrService.model.Emp;




@RestController
@RequestMapping("/HR")
public class HrController 
{
	@Autowired
	private RestTemplate restTemplate;
	
	
	
	@GetMapping("/getemp")
	public List<Object> getemp()
	{
		Object[] emp=restTemplate.getForObject("http://empservice/emp/get", Object[].class);
		return Arrays.asList(emp);
		
	}
	
	@GetMapping("/getdept")
	public List<Object> getdept()
	{
		Object[] dept=restTemplate.getForObject("http://departmeservice/dept/get", Object[].class);
		return Arrays.asList(dept);
		
	}
	
	@GetMapping("/getloc")
	public List<Object> getloc()
	{
		Object[] loc=restTemplate.getForObject("http://locationservice/loc/get", Object[].class);
		return Arrays.asList(loc);
		
	}
//	@PostMapping(path="/postemp")
//	public void postemp(@RequestBody Emp e)
//	{
//		restTemplate.postForObject("http://empservice/emp/save",e, Emp.class);
//	
//		
//	}
	
	
	
	

}
