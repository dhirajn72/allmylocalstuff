package com.java.jaxb.client;

import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.java.jaxb.Customer;
import com.java.jaxb.Customers;

public class TestMarshall {

	public static void main(String[] args) {

		try {
			Customer customer1 = new Customer(11, "singh", "singh@gmail.com",
					"9743854499", 25);
			Customer customer2 = new Customer(12, "singh", "singh@gmail.com",
					"9743854499", 25);
			Customer customer3 = new Customer(13, "singh", "singh@gmail.com",
					"9743854499", 25);
			Customer customer4 = new Customer(14, "singh", "singh@gmail.com",
					"9743854499", 25);

			Customers customers = new Customers();
			customers.addCustomer(customer1);
			customers.addCustomer(customer2);
			customers.addCustomer(customer3);
			customers.addCustomer(customer4);

			JAXBContext jaxbContext = JAXBContext.newInstance(Customers.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.marshal(customers, new FileOutputStream(
					"src/customers.xml"));
			System.out.println("Check src directory");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
