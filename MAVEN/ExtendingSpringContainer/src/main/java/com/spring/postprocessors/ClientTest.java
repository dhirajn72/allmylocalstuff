package com.spring.postprocessors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {
	public static void main(String[] args) {

		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Test test = (Test) applicationContext.getBean("test");
		test.show();
		System.out
				.println("****************************************************************");
		applicationContext.registerShutdownHook();

	}
}
