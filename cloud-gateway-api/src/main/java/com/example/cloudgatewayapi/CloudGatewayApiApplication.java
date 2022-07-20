package com.example.cloudgatewayapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudGatewayApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudGatewayApiApplication.class, args);
	}

}
