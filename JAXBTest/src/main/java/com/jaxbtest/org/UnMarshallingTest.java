package com.jaxbtest.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class UnMarshallingTest {

	public static void main(String[] args) {

		try {

			JAXBContext ctx = JAXBContext.newInstance(Customer.class);

			SchemaFactory schemaFactory = SchemaFactory
					.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = schemaFactory.newSchema(new File("src/cust.xsd"));

			Unmarshaller unmarshaller = ctx.createUnmarshaller();

			//unmarshaller.setSchema(schema);

			Customer customer = (Customer) unmarshaller
					.unmarshal(new FileInputStream("src/cust.xml"));
			System.out.println("Unmarshalling  successfull !!!");
			System.out.println(customer);

		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
