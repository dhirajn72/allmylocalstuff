package com.spring.bussiness.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bussiness.Account;
import com.spring.bussiness.Transaction;

public class Test1 {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		Account account = (Account) applicationContext.getBean("account");
		account.deposite();
		System.out.println("***********");

		// Transaction transaction = (Transaction)
		// applicationContext.getBean("transaction");

		// transaction.miniStatement();
		// transaction.pinChange();

	}

}
