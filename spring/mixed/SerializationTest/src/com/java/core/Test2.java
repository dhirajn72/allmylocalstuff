package com.java.core;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test2 {

	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream(
					"src/customer.ser");
			ObjectInputStream objectInputStream = new ObjectInputStream(
					fileInputStream);
			Customer customer = (Customer) objectInputStream.readObject();
			System.out.println(customer);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
