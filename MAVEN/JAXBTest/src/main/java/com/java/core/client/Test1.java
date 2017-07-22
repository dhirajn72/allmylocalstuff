package com.java.core.client;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.java.core.JAXBTest.Address;
import com.java.core.JAXBTest.Customer;
import com.java.core.JAXBTest.Customers;

public class Test1 {

	public static void main(String[] args) {

		Address address = new Address(42, "MS Palya", "KA", 560097);

		Customer customer = new Customer(99, "Dhiraj Kumar",
				"dhiraj@gmail.com", "9743854499", 25, address);
		Customers customers = new Customers();
		customers.addCustomer(customer);
		customers.addCustomer(customer);
		customers.addCustomer(customer);
		customers.addCustomer(customer);
		customers.addCustomer(customer);

		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Customers.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(customers, new File("src/customers.xml"));
			System.out.println("check src folder !!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
