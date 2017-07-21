package com.java.core;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test4 {
	public static void main(String[] args) {

		try {
			FileInputStream fileInputStream = new FileInputStream(
					"src/stud.ser");
			ObjectInputStream objectInputStream = new ObjectInputStream(
					fileInputStream);
			Student student = (Student) objectInputStream.readObject();

			System.out.println(student);
			objectInputStream.close();
			fileInputStream.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
