package com.java.core.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test5 {
	public static void main(String[] args) {

		try {
			FileInputStream fileInputStream = new FileInputStream(
					"/home/dhiraj/Person.txt");
		
			ObjectInputStream objectInputStream = new ObjectInputStream(
					fileInputStream);
			Object object = objectInputStream.readObject();
			System.out.println(object);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
