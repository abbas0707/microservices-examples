package com.custome.profile.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.custome.profile.service.crm.client.CustomerProfileServiceClient;
import com.custome.profile.service.domain.Customer;
import com.custome.profile.service.domain.Response;
import com.custome.profile.service.repos.CustomerRepositry;

@RestController
@RequestMapping("/customer")
public class CustomerProfileController {

	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerProfileController.class);

	@Autowired
	private CustomerProfileServiceClient profileService;
	@Autowired
	private CustomerRepositry customerRepositry;
    private static final int _SUCCESS_RESP_CODE=0;
    private  static final int _FAILED_RESP_CODE=-1;
    
    private static final String _SUCCESS_RESP_MSG="Operation succesfully completed";
    private  static final String _FAILED_RESP_MSG="Operation failed";

	
	@PostMapping("/create")
	public Response createCustomerProfile(@RequestBody Customer customer) {
		
		LOGGER.info("customer create: {}", customer);
		Response response = new Response();
		if( profileService.create(customer) == 0) {
			
			response.setRespCode(_SUCCESS_RESP_CODE);
			response.setRespDesc(_SUCCESS_RESP_MSG);
			
		}else {
			response.setRespCode(_FAILED_RESP_CODE);
			response.setRespDesc(_FAILED_RESP_MSG);			
			
		}

		return response;
	}

	@PostMapping("/update")
	public Response updateCustomerProfile(@RequestBody Customer customer) {
		
		LOGGER.info("customer update: {}", customer);
		Response response = new Response();
		if( profileService.create(customer) == 0) {
			
			response.setRespCode(_SUCCESS_RESP_CODE);
			response.setRespDesc(_SUCCESS_RESP_MSG);
			
		}else {
			response.setRespCode(_FAILED_RESP_CODE);
			response.setRespDesc(_FAILED_RESP_MSG);		
			
		}

		return response;
	}
	
	@GetMapping("/delete/{id}")
	public Response deleteCustomerProfile(@PathVariable Long id) {
		LOGGER.info("customer delete id :"+ id);
		
		Response response = new Response();
		if( profileService.delete(id) == 0) {
			
			response.setRespCode(_SUCCESS_RESP_CODE);
			response.setRespDesc(_SUCCESS_RESP_MSG);
			
		}else {
			response.setRespCode(_FAILED_RESP_CODE);
			response.setRespDesc(_FAILED_RESP_MSG);					
		}

		return response;
		
	}
	
	@GetMapping("/feigntest")
	public String greeting() {
		LOGGER.info("Test fein client :");
		
		return customerRepositry.greet();
		
	}
	
	@GetMapping("/greet")
	public String secondGreeting() {
		LOGGER.info("Test controller called by feign 2 :");
		
		return "Hello World ";
		
	}
	
	

}
