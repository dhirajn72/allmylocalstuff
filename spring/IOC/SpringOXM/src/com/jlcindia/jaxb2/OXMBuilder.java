package com.jlcindia.jaxb2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;

public class OXMBuilder {

	@Autowired
	Marshaller marshaller;

	@Autowired
	Unmarshaller unmarshaller;

	public void save(Object object, String fname) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(fname);
			marshaller.marshal(object, new StreamResult(fileOutputStream));
			System.out.println("check src folder");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Object load(String fname) {
		Object object = null;
		try {
			FileInputStream fileInputStream = new FileInputStream(fname);
			object = unmarshaller.unmarshal(new StreamSource(fileInputStream));

		} catch (Exception e) {
			e.printStackTrace();
		}

		return object;

	}

}
