package com.xml.jaxb2;

import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.jlcindia.xml.Account;
import com.jlcindia.xml.Customer;
import com.jlcindia.xml.Customers;

public class MTest {
	public static void main(String[] args) {

		try {
			Account account1 = new Account(111, "CA", 100000);
			Customer customer1 = new Customer(109, "singh", 974385449, account1);
			Account account2 = new Account(112, "CA", 100000);
			Customer customer2 = new Customer(110, "DK", 974385449, account2);
			Account account3 = new Account(113, "SA", 100000);
			Customer customer3 = new Customer(114, "kumar", 974385449, account3);

			Customers customers = new Customers();
			customers.addCustomer(customer1);
			customers.addCustomer(customer2);
			customers.addCustomer(customer3);

			JAXBContext jaxbContext = JAXBContext.newInstance(Customers.class);
			Marshaller mar = jaxbContext.createMarshaller();
			// mar.setProperty("jaxb.formatted.output", new Boolean(true));
			mar.marshal(customers, new FileOutputStream("src/cust.xml"));

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}

	}
}
