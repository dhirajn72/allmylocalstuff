package com.jaxbtest.org;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MarshallingTest {

	public static void main(String[] args) {

		Customer customer = new Customer();

		customer.setCid(101);
		customer.setCname("Dhiraj");
		customer.setEmail("dhiraj@gmail.com");
		customer.setPhone(999999999);

		JAXBContext ctx;
		try {
			ctx = JAXBContext.newInstance(Customer.class);

			Marshaller marshaller = ctx.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			marshaller.marshal(customer, new FileOutputStream("src/cust.xml"));
			System.out.println("xml document generated successfully !!!");

		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
