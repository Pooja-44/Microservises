package com.example.HrService.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter

@Document(collection="empdetails")
public class Emp {
	private int empid;
	private String empname;
	private int deptid;
	
	
	
	

}
