package com.java.core.client;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.java.core.JAXBTest.Address;
import com.java.core.JAXBTest.Customer;
import com.java.core.JAXBTest.Customers;

public class Test2 {

	public static void main(String[] args) {

		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Customers.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			Customers customers = (Customers) unmarshaller.unmarshal(new File(
					"src/customers.xml"));
			List<Customer> custList = customers.getCustomers();
			for (Customer c : custList) {
				System.out.println(c);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
