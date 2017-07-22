package com.spring.core.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.Address;
import com.spring.core.Customer;
import com.spring.core.Customers;
import com.spring.core.marshaller.MarshallerUnmarshaller;

public class TestUnmar {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		MarshallerUnmarshaller marshallerUnmarshaller = (MarshallerUnmarshaller) applicationContext
				.getBean("marshallerUnmarshaller");
		Customers customers = (Customers) marshallerUnmarshaller
				.unMarshall("src/customers.xml");
		List<Customer> list = customers.getCustomers();
		for (Customer customer : list) {
			System.out.println(customer);
		}

	}
}
