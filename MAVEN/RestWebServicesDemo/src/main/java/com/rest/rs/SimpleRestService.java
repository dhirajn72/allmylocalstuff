package com.rest.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/rest")
public class SimpleRestService {

	@GET
	@Path("/getAll")
	@Produces(MediaType.TEXT_PLAIN)
	public void getAllCustomers() {

	}

	@GET
	@Path("/getCustomerById/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public void getCustomerById(@PathParam("id") int id) {
		// use the id and contact to DB, perform operations

	}
}
