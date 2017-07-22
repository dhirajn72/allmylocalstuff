package com.jlcindia.spring.cxf;

import javax.jws.WebService;

@WebService(endpointInterface = "com.jlcindia.spring.cxf.HelloService")
public class HelloServiceBean implements HelloService {

	@Override
	public String getMessage(String name) {

		System.out.println("In getMessage()");
		String msg = "Hello " + name + " welcome to spring cxf world";
		System.out.println(msg);
		return msg;
	}
}
