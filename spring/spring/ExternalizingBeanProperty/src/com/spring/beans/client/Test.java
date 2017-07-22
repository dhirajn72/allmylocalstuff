package com.spring.beans.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.DSBeans;
import com.spring.beans.DriverClass;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		DSBeans dsBeans = (DSBeans) applicationContext.getBean("DSBeans");
		dsBeans.showDS();

	}
}
