package com.spring.oxm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.xml.oxm.Account;
import com.spring.xml.oxm.Customer;
import com.spring.xml.oxm.Customers;
import com.spring.xml.oxm.MainMarshaller;

public class MTest {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		MainMarshaller mainMarshaller = (MainMarshaller) applicationContext
				.getBean("mainMarshaller");

		Account account1 = new Account(10, "SA", 10000);
		Customer customer1 = new Customer("CUST-1", "DK", "dk@gmail.com",
				"999999", account1);

		Account account2 = new Account(11, "SA", 20000);
		Customer customer2 = new Customer("CUST-2", "SINGH", "singh@gmail.com",
				"88888", account2);

		Account account3 = new Account(12, "CA", 10000);
		Customer customer3 = new Customer("CUST-3", "KUMAR", "kumar@gmail.com",
				"7777777", account3);

		Customers cust = new Customers();
		cust.addCustomers(customer1);
		cust.addCustomers(customer2);
		cust.addCustomers(customer3);
		mainMarshaller.save(cust, "src/customer.xml");

	}

}
