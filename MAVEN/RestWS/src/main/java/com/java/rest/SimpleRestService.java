package com.java.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.java.rest.ws.Customer;
import com.java.rest.ws.Customers;

@Path("/cust")
public class SimpleRestService {

	private static final Logger logger = Logger
			.getLogger(SimpleRestService.class);

	@GET
	@Path("/getAll")
	@Produces(MediaType.APPLICATION_XML)
	public Customers getSomething() {

		Customer customer = new Customer(99, "Dhiraj", "dhiraj@gmail.com",
				"9743854499");
		Customers c = new Customers();
		c.getCustomers().add(customer);
		c.getCustomers().add(customer);
		c.getCustomers().add(customer);
		c.getCustomers().add(customer);
		c.getCustomers().add(customer);
		return c;
	}
}
