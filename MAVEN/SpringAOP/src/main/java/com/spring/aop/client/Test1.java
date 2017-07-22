package com.spring.aop.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.Account;

public class Test1 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Account account = (Account) applicationContext.getBean("account");
		account.updateAccount();
		System.out.println("**************");
		account.applyCheckBook();

	}
}
