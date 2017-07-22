package com.java.rest.easy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/restws")
public class BaseClass {

	@GET
	@Path("/getAll")
	@Produces(MediaType.APPLICATION_XML)
	public Customers getAll() {
		System.out.println("getAll()");
		Customer customer = new Customer(99, "Singh", "singh@gmail.com",
				"9743854499");
		Customers customers = new Customers();
		customers.addCustomer(customer);
		customers.addCustomer(customer);
		customers.addCustomer(customer);
		customers.addCustomer(customer);

		return customers;

	}

}
