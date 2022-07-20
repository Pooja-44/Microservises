package com.example.HrService.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection="Location")
public class Location 
{
	private int locId;
	private String locName;
	
	

}
