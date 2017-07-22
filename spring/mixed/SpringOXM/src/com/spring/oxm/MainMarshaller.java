package com.spring.oxm;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;

public class MainMarshaller {

	@Autowired
	Marshaller marshaller;

	@Autowired
	Unmarshaller unmarshaller;

	public void save(Object object, String fname) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(fname);
			System.out.println(marshaller);
			marshaller.marshal(object, new StreamResult(fileOutputStream));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Object load(String fname) {
		Customers customers = null;
		try {
			FileInputStream fileInputStream = new FileInputStream(fname);
			System.out.println(unmarshaller);
			customers = (Customers) unmarshaller.unmarshal(new StreamSource(
					fileInputStream));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return customers;
	}

}
