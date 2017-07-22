package com.java.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/cust")
public class RestDemo {

	@GET
	@Path("/getAll")
	@Produces(MediaType.APPLICATION_XML)
	public Customers getAllCustomer() {
		Customer c = new Customer(88, "Dhiraj", "dhiraj@gmail.com",
				"9743854499");
		Customers cs = new Customers();
		cs.getList().add(c);
		cs.getList().add(c);
		cs.getList().add(c);
		cs.getList().add(c);
		cs.getList().add(c);
		return cs;
	}

	@GET
	@Path("/getCustomerById/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Customer getCustomerById(@PathParam("id") int id) {
		Customer c = new Customer(id, "Dhiraj", "dhiraj@gmail.com",
				"9743854499");
		return c;
	}

}
