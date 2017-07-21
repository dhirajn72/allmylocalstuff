package com.java.test.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentDeser {
	public static void main(String[] args) {

		try {
			ObjectInputStream objectInputStream = new ObjectInputStream(
					new FileInputStream("stuser.ser"));

			Student student = (Student) objectInputStream.readObject();
			System.out.println(student);
			System.out.println("DeSerialized !!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
