package com.jlcindia.xml.client;

import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.jlcindia.xml.Account;
import com.jlcindia.xml.Customer;
import com.jlcindia.xml.Customers;

public class MarshallingTest {

	public static void main(String[] args) {

		try {
			Account account1 = new Account(101, "CA", 10000);
			Customer customer1 = new Customer(1111, "DK", 99999, account1);

			Account account2 = new Account(102, "SA", 20000);
			Customer customer2 = new Customer(2222, "singh", 88888, account2);

			Account account3 = new Account(103, "CA", 30000);
			Customer customer3 = new Customer(3333, "kumar", 99999, account3);

			Account account4 = new Account(104, "SA", 40000);
			Customer customer4 = new Customer(4444, "SRI", 99999, account4);

			Customers customers = new Customers();
			customers.addCustomer(customer1);
			customers.addCustomer(customer2);
			customers.addCustomer(customer3);
			customers.addCustomer(customer4);

			JAXBContext jaxbContext = JAXBContext.newInstance(Customers.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.marshal(customers, new FileOutputStream(
					"src/customer.xml"));

			System.out.println("Check src folder.");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
