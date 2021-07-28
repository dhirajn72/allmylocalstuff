package com.java.core;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test1 {

	public static void main(String[] args) {

		try {
			FileOutputStream fileOutputStream = new FileOutputStream(
					"src/customer.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(
					fileOutputStream);

			Customer customer = new Customer();
			customer.setCid(101);
			customer.setCname("Dhiraj");
			customer.setEmail("dhiraj@gmail.com");
			customer.setPhone(Long.parseLong("12345"));

			objectOutputStream.writeObject(customer);
			System.out.println("Serialized..");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
