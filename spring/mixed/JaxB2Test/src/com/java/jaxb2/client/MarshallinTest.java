package com.java.jaxb2.client;

import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.java.jaxb2.Account;
import com.java.jaxb2.Customer;
import com.java.jaxb2.Customers;

public class MarshallinTest {

	public static void main(String[] args) {
		Account account = new Account("SBI-099", 100000, "SA");
		Customer customer = new Customer(101, "Dhiraj", "dhiraj@gmail.com",
				"12345", account);
		Customers customers = new Customers();
		customers.addCustomer(customer);
		customers.addCustomer(customer);
		customers.addCustomer(customer);

		try {
			FileOutputStream fileOutputStream = new FileOutputStream(
					"src/customer.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customers.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			// marshaller.setProperty("jaxb.formatted.output", new
			// Boolean(true));
			marshaller.marshal(customers, fileOutputStream);
			System.out.println("Done, check src directory");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
