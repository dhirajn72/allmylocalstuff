package com.spring.rest.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.to.CustomerTO;
import com.spring.rest.to.Customers;

@RestController
public class BaseController {

	@RequestMapping(value = "/getAll", produces = { "application/xml",
			"application/json" }, method = RequestMethod.GET)
	public Customers getAllCustomers() {
		System.out.println("/getAll");
		Customers customers = new Customers();
		CustomerTO to = new CustomerTO(99, "Dhiraj", "dhiraj@gmail.com",
				"12345", 25);
		customers.addCustomer(to);
		customers.addCustomer(to);
		customers.addCustomer(to);
		customers.addCustomer(to);
		customers.addCustomer(to);
		return customers;
	}

	@RequestMapping(value = "/getCustById/{id}", produces = {
			"application/xml", "application/json" }, method = RequestMethod.GET)
	public CustomerTO getCustomerById(@PathVariable("id") int id) {
		System.out.println("/getAll");
		Customers customers = new Customers();
		CustomerTO to = new CustomerTO(id, "Dhiraj", "dhiraj@gmail.com",
				"12345", 25);
		return to;
	}

}
