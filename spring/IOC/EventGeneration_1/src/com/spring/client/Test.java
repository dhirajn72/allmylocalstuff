package com.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.events.EventGeneratorClass;
import com.spring.events.NewCustomer;

public class Test {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		EventGeneratorClass eventGeneratorClass = (EventGeneratorClass) applicationContext
				.getBean("generatorClass");

		NewCustomer newCustomer = new NewCustomer(001, "Dhiraj",
				"dhirajSingh@gmail.com", "9743854499");
		eventGeneratorClass.Event(newCustomer);

	}
}
