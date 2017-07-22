package com.spring.rest.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.persistence.dao.CustomerDAO;
import com.spring.rest.ws.to.Customers;

@RestController
public class MainController {

	@Autowired
	CustomerDAO dao;

	@RequestMapping(value = "/getAll", produces = { "application/xml",
			"application/json" }, method = RequestMethod.GET)
	public Customers getAll() {
		return dao.getAllCustomers();

	}

}
