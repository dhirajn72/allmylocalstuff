package com.jlcindia.spring.oxm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jlcindia.xml.Account;
import com.jlcindia.xml.Customer;
import com.jlcindia.xml.Customers;

public class MTest {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		JLCMarshaller jlcMarshaller = (JLCMarshaller) applicationContext
				.getBean("oxm");
		Account account1 = new Account(111, "CA", 100000);
		Customer customer1 = new Customer(109, "singh", 974385449, account1);
		Account account2 = new Account(112, "CA", 100000);
		Customer customer2 = new Customer(110, "DK", 974385449, account2);
		Account account3 = new Account(113, "SA", 100000);
		Customer customer3 = new Customer(114, "kumar", 974385449, account3);

		Customers customers = new Customers();
		customers.addCustomer(customer1);
		customers.addCustomer(customer2);
		customers.addCustomer(customer3);

		jlcMarshaller.save(customers, "src/customer.xml");

	}

}
