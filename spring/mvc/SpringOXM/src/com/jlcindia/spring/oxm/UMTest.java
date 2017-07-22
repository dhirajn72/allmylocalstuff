package com.jlcindia.spring.oxm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jlcindia.xml.Customer;
import com.jlcindia.xml.Customers;

public class UMTest {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		JLCMarshaller jlcMarshaller = (JLCMarshaller) applicationContext
				.getBean("oxm");

		Customers cust = (Customers) jlcMarshaller.load("src/customer.xml");
		List<Customer> cust2 = cust.getCustomers();
		for (Customer customer : cust2) {
			System.out.println(customer);
		}

	}
}
