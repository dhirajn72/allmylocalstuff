package com.core.java;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Tes1 {

	public static void main(String[] args) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(
					"/home/dhiraj/stu.txt");

			ObjectOutputStream objectOutputStream = new ObjectOutputStream(
					fileOutputStream);

			Student student = new Student(99, "Singh", "singh@gmail.com",
					"12345");

			objectOutputStream.writeObject(student);
			System.out.println("Serialized..");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
