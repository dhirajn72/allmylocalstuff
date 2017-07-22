package com.spring.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestDemo {

	@RequestMapping(value = "/getAll", produces = { MediaType.APPLICATION_XML_VALUE }, method = RequestMethod.GET)
	public Customers getAll() {
		Customer c1 = new Customer(99, "Sri", "sri@gmail.com", "97439999");
		Customers list = new Customers();
		list.addCustomer(c1);
		list.addCustomer(c1);
		list.addCustomer(c1);
		list.addCustomer(c1);
		list.addCustomer(c1);
		return list;

	}

}
