package com.java.core;

import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class Test1 {
	public static void main(String[] args) {
		Address address = new Address(42, "MS Palya", "KA", 560097);
		Customer customer = new Customer(99, "dk", "dk@gmail.com",
				"12345", address);
		Customers customers = new Customers();
		for (int i = 0; i < 100; i++) {
			customers.addCustomer(customer);
		}

		try {

			FileOutputStream fileOutputStream = new FileOutputStream(
					"src/cust.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customers.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.marshal(customers, fileOutputStream);
			System.out.println("Check src folder !!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
