package com.spring.core.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.Test;
import com.spring.core.Test2;

public class Test1 {
	public static void main(String[] args) {

		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Test test1 = (Test) applicationContext.getBean("test");
		System.out.println("***********");

		System.out.println("_____________________");
		Test2 test2 = (Test2) applicationContext.getBean("test2");
		System.out.println("***********");
		applicationContext.registerShutdownHook();

	}
}
