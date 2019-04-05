package com.spring.cloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/hello")
public class MessageController {
	@Value("${welcome.message}")
	   String welcomeText;
	   
	 
	   @RequestMapping(value = "/message")
	   public String welcomeText() {
	      return welcomeText;
	   }
}
