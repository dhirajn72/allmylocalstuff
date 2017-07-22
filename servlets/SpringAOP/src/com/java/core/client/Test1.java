package com.java.core.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.core.AccountService;

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		AccountService accountService = (AccountService) applicationContext
				.getBean("accountService");
		accountService.deposit();

	}

}
