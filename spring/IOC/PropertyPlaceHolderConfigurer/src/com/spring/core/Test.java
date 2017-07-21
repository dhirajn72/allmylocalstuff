package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		DBConfigFile configFile = (DBConfigFile) context.getBean("mySqldb");
		System.out.println("*****MySql Info*****");
		System.out.println(configFile);
		System.out.println("*****Oracle Info*****");
		configFile = (DBConfigFile) context.getBean("oracledb");
		System.out.println(configFile);

	}

}
