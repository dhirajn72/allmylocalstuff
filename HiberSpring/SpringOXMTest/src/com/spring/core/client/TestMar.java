package com.spring.core.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.Address;
import com.spring.core.Customer;
import com.spring.core.Customers;
import com.spring.core.marshaller.MarshallerUnmarshaller;

public class TestMar {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		MarshallerUnmarshaller marshallerUnmarshaller = (MarshallerUnmarshaller) applicationContext
				.getBean("marshallerUnmarshaller");
		Address address = new Address("#42", "MS Palya", "KA", 560097);
		Customer customer = new Customer(99, "Dhiraj", "dhiraj@gmail.com",
				"12345", address);
		Customers customers = new Customers();
		for (int i = 0; i < 10; i++) {
			customers.addCustomer(customer);

		}
		marshallerUnmarshaller.marshall(customers, "src/customers.xml");

	}
}
