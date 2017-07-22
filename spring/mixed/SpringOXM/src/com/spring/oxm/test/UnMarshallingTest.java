package com.spring.oxm.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.oxm.Customer;
import com.spring.oxm.Customers;
import com.spring.oxm.MainMarshaller;

public class UnMarshallingTest {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		MainMarshaller mainMarshaller = (MainMarshaller) applicationContext
				.getBean("mainMarshaller");
		Customers customers = (Customers) mainMarshaller
				.load("src/customers.xml");
		List<Customer> customers2 = customers.getCustomers();
		for (Customer customer : customers2) {
			System.out.println(customer);
		}

	}

}
