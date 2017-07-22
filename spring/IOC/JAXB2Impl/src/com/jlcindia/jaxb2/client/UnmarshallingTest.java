package com.jlcindia.jaxb2.client;

import java.io.FileInputStream;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.jlcindia.jaxb2.Customer;
import com.jlcindia.jaxb2.Customers;

public class UnmarshallingTest {

	public static void main(String[] args) {

		try {
			FileInputStream fileInputStream = new FileInputStream(
					"src/customers.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customers.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			Customers customers = (Customers) unmarshaller
					.unmarshal(fileInputStream);
			List<Customer> list = customers.getCustomers();
			for (Customer c : list) {
				System.out.println(c);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
