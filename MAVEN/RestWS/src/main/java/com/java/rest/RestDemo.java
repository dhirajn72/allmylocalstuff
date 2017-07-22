package com.java.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.java.rest.ws.Customer;

@Path("/cust")
public class RestDemo {

	@GET
	@Path("/getCustById/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Customer getAll(@PathParam("id") String id) {
		System.out.println("getAll()");
		Customer c = new Customer(Integer.parseInt(id), "Sri", "sri@gmail.com",
				"97439999");
		return c;

	}

}
