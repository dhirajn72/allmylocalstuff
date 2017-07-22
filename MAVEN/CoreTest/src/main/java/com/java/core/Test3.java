package com.java.core;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test3 {
	public static void main(String[] args) {

		try {
			FileOutputStream fileOutputStream = new FileOutputStream(
					"src/main/resources/cust.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(
					fileOutputStream);
			Customer customer = new Customer(99, "dhiraj", "dhiraj@gmail.com",
					"9742765205");
			objectOutputStream.writeObject(customer);
			System.out.println("Serialized !! ");

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
