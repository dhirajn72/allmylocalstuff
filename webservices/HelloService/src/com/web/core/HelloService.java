package com.web.core;

public class HelloService {
	public String getMessage(String name) {
		String msg = "Hello " + name + " welcome to webservices using axis-2";
		System.out.println(msg);
		return msg;

	}
}
