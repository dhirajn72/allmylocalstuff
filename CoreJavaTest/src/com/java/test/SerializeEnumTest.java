package com.java.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeEnumTest {
	private static final String DATA_FILE = "data.ser";

	public static void main(String[] args) throws Exception {
		store();
		read();
	}

	private static void store() throws Exception {
		ObjectOutputStream oOut = new ObjectOutputStream(new FileOutputStream(
				DATA_FILE));
		TestEnum.FIRST.setField(12);
		System.out.println("Storing " + TestEnum.FIRST);
		oOut.writeObject(TestEnum.FIRST);
		oOut.close();
	}

	private static void read() throws Exception {
		ObjectInputStream oIn = new ObjectInputStream(new FileInputStream(
				DATA_FILE));
		TestEnum e = (TestEnum) oIn.readObject();
		System.out.println("Read: " + e);
	}
}
