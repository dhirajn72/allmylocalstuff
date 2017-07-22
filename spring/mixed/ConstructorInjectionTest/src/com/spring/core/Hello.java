/**
 * 
 */
package com.spring.core;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/**
 * @author Dhiraj Kumar
 * @website www.facebook.com/dhiraj.singh.90
 */
public class Hello {
	private Customer customer;
	private Customer1 customer1;
	private Customer2 customer2;

	public Hello() {
		System.out.println("DC");
	}

	public Hello(Customer customer) {
		this.customer = customer;
		System.out.println("Hello-1 args");
	}

	public Hello(Customer customer, Customer1 customer1) {
		this.customer = customer;
		this.customer1 = customer1;
		System.out.println("Hello-2 args");
	}

	public Hello(Customer customer, Customer1 customer1, Customer2 customer2) {
		this.customer = customer;
		this.customer1 = customer1;
		this.customer2 = customer2;

		System.out.println("Hello-3 args");

	}

	@Override
	public String toString() {
		return customer + "";
	}

}
