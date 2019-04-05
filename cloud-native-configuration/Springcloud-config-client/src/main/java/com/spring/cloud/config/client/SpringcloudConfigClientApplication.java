package com.spring.cloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RefreshScope
public class SpringcloudConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConfigClientApplication.class, args);
	}
	
	

}
