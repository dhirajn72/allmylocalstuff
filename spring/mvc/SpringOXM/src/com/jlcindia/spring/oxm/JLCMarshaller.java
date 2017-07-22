package com.jlcindia.spring.oxm;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

public class JLCMarshaller {

	@Autowired
	Marshaller marshaller;

	@Autowired
	Unmarshaller unmarshaller;

	public void save(Object object, String fname) {
		try {
			FileOutputStream fos = new FileOutputStream(fname);
			System.out.println(marshaller);
			marshaller.marshal(object, new StreamResult(fos));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Object load(String fname) {
		Object obj = null;
		try {
			FileInputStream fis = new FileInputStream(fname);
			obj = unmarshaller.unmarshal(new StreamSource(fis));
			Jaxb2Marshaller x = new Jaxb2Marshaller();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return obj;
	}

}
