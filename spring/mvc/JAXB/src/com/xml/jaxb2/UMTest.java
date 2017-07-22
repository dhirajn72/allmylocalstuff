package com.xml.jaxb2;

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
					.unmarshal(new FileInputStream("src/cust.xml"));
			List<Customer> list = customers.getCustomers();
			for (Customer c : list) {
				System.out.println(c);
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}

	}

}
