package com.java.core;

import java.io.FileInputStream;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class Test2 {
	public static void main(String[] args) {

		try {
			FileInputStream fileInputStream = new FileInputStream(
					"src/cust.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customers.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			Customers customers = (Customers) unmarshaller
					.unmarshal(fileInputStream);
			List<Customer> customers2 = customers.getCustomers();
			int i = 01;
			for (Customer customer : customers2) {
				System.out.print(i++ + "->");
				System.out.println(customer);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
