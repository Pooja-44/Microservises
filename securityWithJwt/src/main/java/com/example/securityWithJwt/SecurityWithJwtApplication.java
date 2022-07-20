package com.example.securityWithJwt;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.securityWithJwt.Entity.User;
import com.example.securityWithJwt.repository.UserRepo;



@SpringBootApplication
@EnableDiscoveryClient
public class SecurityWithJwtApplication {

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SecurityWithJwtApplication.class, args);
		
	}
	@Autowired
	UserRepo repo;
	
   @PostConstruct
	public void initUser()
	{
		List<User> users=new ArrayList<>();
		users.add(new User(101, "user1", "user1@123", "user@gmail.com"));
	
		
		repo.saveAll(users);
	}
	
}