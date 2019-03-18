package com.customer.profile.service.discovery.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
  
@SpringBootApplication
@EnableEurekaServer
public class CustomerServiceDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceDiscoveryServerApplication.class, args);
	}

}
