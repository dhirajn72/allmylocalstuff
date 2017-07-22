package com.jlcindia.jaxb2.client;

import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.jlcindia.jaxb2.Account;
import com.jlcindia.jaxb2.Customer;
import com.jlcindia.jaxb2.Customers;

public class MarshallingTest {

	public static void main(String[] args) {

		Account account = new Account(101, "SA", 10000);
		Customer customer = new Customer("C-001", "Singh", "singh@gmail.com",
				account);

		Account account1 = new Account(102, "SA", 10000);
		Customer customer1 = new Customer("C-002", "DK", "dk@gmail.com",
				account1);

		Account account2 = new Account(103, "SA", 10000);
		Customer customer2 = new Customer("C-003", "Kumar", "kumar@gmail.com",
				account2);

		Customers customers = new Customers();
		customers.addCustomer(customer);
		customers.addCustomer(customer1);
		customers.addCustomer(customer2);
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Customers.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.marshal(customers, new FileOutputStream(
					"src/customers.xml"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
