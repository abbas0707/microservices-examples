package com.custome.profile.service.repos;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient( name = "customer-profile-service")
public interface CustomerRepositry {
	
	@RequestMapping(method = RequestMethod.GET, value = "/customer/greet")
	String greet();

}
