package com.java.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.spring.AccountService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		AccountService accountService = (AccountService) applicationContext
				.getBean("as");

		accountService.deposite();
		System.out.println("**************");
		accountService.balanceCheck();
		System.out.println("***************");
		accountService.withdraw();

	}
}
