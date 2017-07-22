package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client1 {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Test test = (Test) applicationContext.getBean("test");
		// test.show();

		Hello hello1 = (Hello) applicationContext.getBean("hello");
		Hello hello2 = (Hello) applicationContext.getBean("hello");
		Hello hello3 = (Hello) applicationContext.getBean("hello");
		Hello hello4 = (Hello) applicationContext.getBean("hello");
		Hello hello5 = (Hello) applicationContext.getBean("hello");
		Hello hello6 = (Hello) applicationContext.getBean("hello");
		Hello hello7 = (Hello) applicationContext.getBean("hello");
		Hello hello8 = (Hello) applicationContext.getBean("hello");
		System.out.println(hello1.hashCode());
		System.out.println(hello2.hashCode());
		System.out.println(hello3.hashCode());
		System.out.println(hello4.hashCode());
		System.out.println(hello5.hashCode());
		System.out.println(hello6.hashCode());
		System.out.println(hello7.hashCode());
		System.out.println(hello8.hashCode());

	}
}
