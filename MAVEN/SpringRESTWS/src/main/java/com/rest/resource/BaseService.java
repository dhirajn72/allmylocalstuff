package com.rest.resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.resource.to.CustomerTO;
import com.rest.resource.to.Customers;

@RestController
public class BaseService {

	@RequestMapping(value = "/getAll", produces = {
			MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE }, method = RequestMethod.GET)
	public Customers getAll() {
		Customers customers = new Customers();
		CustomerTO to = new CustomerTO(55, "dhiraj", "dhiraj@gmail.com",
				"9743854499");
		customers.addCustomer(to);
		customers.addCustomer(to);
		customers.addCustomer(to);
		customers.addCustomer(to);
		customers.addCustomer(to);
		return customers;
	}

	@RequestMapping(value = "/getById/{id}", produces = {
			MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE }, method = RequestMethod.GET)
	public CustomerTO getCustomerById(@PathVariable("id") String id) {
		CustomerTO to = new CustomerTO(Integer.parseInt(id), "Singh",
				"singh@gmail.com", "9743854499");
		return to;
	}

	@RequestMapping(value = "/getById/", method = RequestMethod.GET)
	public void getFormData(@ModelAttribute("cust") String id) {
		CustomerTO to = new CustomerTO(Integer.parseInt(id), "Singh",
				"singh@gmail.com", "9743854499");
		System.out.println(to);

	}

}
