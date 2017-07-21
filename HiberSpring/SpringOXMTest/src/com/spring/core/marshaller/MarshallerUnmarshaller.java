package com.spring.core.marshaller;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;

import com.spring.core.Customers;

public class MarshallerUnmarshaller {

	@Autowired
	Marshaller marshaller;
	@Autowired
	Unmarshaller unmarshaller;

	public void marshall(Customers customers, String file) {
		/*
		 * System.out.println(marshaller); System.out.println(unmarshaller);
		 */

		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			marshaller.marshal(customers, new StreamResult(fileOutputStream));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Object unMarshall(String file) {
		Customers customers = new Customers();
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			customers = (Customers) unmarshaller.unmarshal(new StreamSource(
					fileInputStream));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return customers;
	}

}
