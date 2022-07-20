package com.example.HrService.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Document(collection="deptdetails")
public class Department 
{
	private int deptId;
	private String deptName;
	private int locId;

}
