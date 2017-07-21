package com.jlcindia.jaxb2.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jlcindia.jaxb2.Customer;
import com.jlcindia.jaxb2.Customers;
import com.jlcindia.jaxb2.OXMBuilder;

public class UnmarshallingTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		OXMBuilder oxmBuilder = (OXMBuilder) applicationContext
				.getBean("oxmBuilder");

		Customers customers = (Customers) oxmBuilder.load("src/customer.xml");
		List<Customer> list = customers.getCustomers();
		for (Customer c : list) {
			System.out.println(c);
		}

	}

}
