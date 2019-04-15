package com.custome.profile.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan("com.customer.profile.service.repos,com.customer.profile.service.crm.client,com.customer.profile.service.repos")

@EnableFeignClients
@SpringBootApplication
public class CustomerProfileServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerProfileServiceApplication.class, args);
	}

}
