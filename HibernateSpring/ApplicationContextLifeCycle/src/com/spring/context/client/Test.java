package com.spring.context.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.context.BeanClass;

public class Test {
	public static void main(String[] args) {

		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		BeanClass beanClass = (BeanClass) applicationContext
				.getBean("beanClass");

		applicationContext.registerShutdownHook();

	}
}
