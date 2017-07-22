package com.jlcindia.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/hello")
public class HelloService {

	@GET
	@Path("/gm1/{name}")
	public String getMessage1(@PathParam("name") String name) {
		String msg = "Hello " + name + " Welcome to rest webservices";
		System.out.println(msg);
		return msg;
	}

	@GET
	@Path("/gm2/")
	public UserMessage getMessage2(User user) {
		String name = user.getName();
		String email = user.getEmail();
		String msg = "Hello " + name
				+ " Welcome to rest webservices \n your email is :" + email;
		System.out.println(msg);
		UserMessage userMessage = new UserMessage();
		userMessage.setMsg(msg);
		return userMessage;
	}
}
