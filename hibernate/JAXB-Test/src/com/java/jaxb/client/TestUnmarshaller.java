package com.java.jaxb.client;

import java.io.FileInputStream;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.java.jaxb.Customer;
import com.java.jaxb.Customers;

public class TestUnmarshaller {

	public static void main(String[] args) {

		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Customers.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			Customers customers = (Customers) unmarshaller
					.unmarshal(new FileInputStream("src/customers.xml"));
			List<Customer> customers2 = customers.getCustomers();

			for (Customer cust : customers2) {
				System.out.println(cust);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
