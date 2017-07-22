package com.java.core;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeVersioIdTest {
	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("/home/dhiraj/vit.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			VersionIdTest test = new VersionIdTest();
			oos.writeObject(test);
			System.out.println("Serialised !!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
