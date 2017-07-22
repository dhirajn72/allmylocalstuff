package com.java.core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test4 {
	public static void main(String[] args) {

		try {
			FileInputStream fileInputStream = new FileInputStream(
					"src/main/resources/cust.ser");
			ObjectInputStream objectInputStream = new ObjectInputStream(
					fileInputStream);
			Customer customer = (Customer) objectInputStream.readObject();
			System.out.println(customer);
			System.out.println("Deserialized !! ");

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
