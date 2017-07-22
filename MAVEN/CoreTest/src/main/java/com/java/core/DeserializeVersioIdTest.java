package com.java.core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializeVersioIdTest {
	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("/home/dhiraj/vit.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			VersionIdTest test = (VersionIdTest) ois.readObject();
			System.out.println(test.getId());
			System.out.println("Deserialised !!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
