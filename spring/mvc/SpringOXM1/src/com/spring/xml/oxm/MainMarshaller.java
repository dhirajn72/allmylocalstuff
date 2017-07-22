package com.spring.xml.oxm;

import java.io.FileInputStream;
import java.io.FileOutputStream;

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

	public void save(Object obj, String fname) {

		try {
			FileOutputStream fos = new FileOutputStream(fname);
			marshaller.marshal(obj, new StreamResult(fname));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Object load(String fname) {
		Object object = null;
		try {
			FileInputStream fis = new FileInputStream(fname);
			object = unmarshaller.unmarshal(new StreamSource(fis));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return object;
	}
}
