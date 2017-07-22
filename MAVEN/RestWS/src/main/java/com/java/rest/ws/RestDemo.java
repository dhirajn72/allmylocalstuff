package com.java.rest.ws;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Path;

@Path("/cust")
public class RestDemo {

	@Path("/getAll")
	// @Produces(MediaType.APPLICATION_XML)
	public List<Customer> getAll() {
		System.out.println("getAll()");
		Customer c1 = new Customer(99, "Sri", "sri@gmail.com", "97439999");
		List<Customer> list = new ArrayList<Customer>();
		list.add(c1);
		list.add(c1);
		list.add(c1);
		list.add(c1);
		list.add(c1);
		return list;

	}

}
