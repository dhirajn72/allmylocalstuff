package com.jlcindia.jaxb2.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jlcindia.jaxb2.Account;
import com.jlcindia.jaxb2.Customer;
import com.jlcindia.jaxb2.Customers;
import com.jlcindia.jaxb2.OXMBuilder;

public class MarshallingTest {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		OXMBuilder oxmBuilder = (OXMBuilder) applicationContext
				.getBean("oxmBuilder");

		Account account = new Account(101, "SA", 10000);
		Customer customer = new Customer("C-001", "Singh", "singh@gmail.com",
				account);

		Account account1 = new Account(102, "SA", 10000);
		Customer customer1 = new Customer("C-002", "DK", "dk@gmail.com",
				account1);

		Account account2 = new Account(103, "SA", 10000);
		Customer customer2 = new Customer("C-003", "Kumar", "kumar@gmail.com",
				account2);

		Customers customers = new Customers();
		customers.addCustomer(customer);
		customers.addCustomer(customer1);
		customers.addCustomer(customer2);

		oxmBuilder.save(customers, "src/customer.xml");
	}

}
