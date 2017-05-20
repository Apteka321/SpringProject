package com.ecommerce.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecommerce.customer.domain.Customer;
import com.ecommerce.customer.domain.forms.RegisterCustomerForm;

@Controller
public class LoginCustomerController {

	@RequestMapping("/customer-account")
	public String customerLoginGetway() {
		
		return "customer-account";
	}
	
	@RequestMapping("/sign-in")
	public String customerLogin() {
		
		return "sign-in";
	}
	

}
