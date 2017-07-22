package com.jaxb2.xml.client;

import java.io.FileOutputStream;

import javax.swing.text.DefaultEditorKit.CutAction;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.jaxb2.xml.Account;
import com.jaxb2.xml.Customer;
import com.jaxb2.xml.Customers;

public class MTest {

	public static void main(String[] args) {

		try {
			Account account1 = new Account(101, "CA", 10000);
			Customer customer1 = new Customer(99, "Singh", "singh", 999999,
					account1);
			Account account2 = new Account(101, "CA", 10000);
			Customer customer2 = new Customer(88, "KUMAR", "kumar@gmail.com",
					8888888, account2);

			Account account3 = new Account(101, "CA", 10000);
			Customer customer3 = new Customer(77, "DK", "dk@yahoo.com", 777777,
					account3);

			Customers cust = new Customers();
			cust.addCustomer(customer1);
			cust.addCustomer(customer2);
			cust.addCustomer(customer3);

			JAXBContext jaxbContext = JAXBContext.newInstance(Customers.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.marshal(cust, new FileOutputStream("src/customers.xml"));
			System.out.println("Done!!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
