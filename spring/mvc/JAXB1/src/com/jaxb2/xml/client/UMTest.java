package com.jaxb2.xml.client;

import java.io.FileInputStream;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.jaxb2.xml.Customer;
import com.jaxb2.xml.Customers;

public class UMTest {

	public static void main(String[] args) {

		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Customers.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			Customers customers = (Customers) unmarshaller
					.unmarshal(new FileInputStream("src/customers.xml"));

			List<Customer> list = customers.getCustomers();
			for (Customer cust : list) {
				System.out.println(cust);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
