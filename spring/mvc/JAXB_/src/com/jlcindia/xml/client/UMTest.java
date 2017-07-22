package com.jlcindia.xml.client;

import java.io.FileInputStream;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.jlcindia.xml.Customer;
import com.jlcindia.xml.Customers;

public class UMTest {

	public static void main(String[] args) {

		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Customers.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			Customers customers = (Customers) unmarshaller
					.unmarshal(new FileInputStream("src/customer.xml"));
			List<Customer> cust = customers.getCustomers();
			for (Customer customer : cust) {
				System.out.println(customer);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
