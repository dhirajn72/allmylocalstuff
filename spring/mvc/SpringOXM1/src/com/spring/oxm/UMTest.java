package com.spring.oxm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.xml.oxm.Customer;
import com.spring.xml.oxm.Customers;
import com.spring.xml.oxm.MainMarshaller;

public class UMTest {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		MainMarshaller mainMarshaller = (MainMarshaller) applicationContext
				.getBean("mainMarshaller");

		Customers customers = (Customers) mainMarshaller
				.load("src/customer.xml");
		List<Customer> list = customers.getCustomers();
		for (Customer cust : list) {
			System.out.println(cust);
		}

	}
}
