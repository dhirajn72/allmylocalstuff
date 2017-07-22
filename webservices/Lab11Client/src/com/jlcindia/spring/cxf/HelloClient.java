package com.jlcindia.spring.cxf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloClient {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"jlcindia-client.xml");
		HelloService helloService = (HelloService) applicationContext
				.getBean("helloService");
		System.out.println(helloService.getMessage("Srinivas"));

	}
}
