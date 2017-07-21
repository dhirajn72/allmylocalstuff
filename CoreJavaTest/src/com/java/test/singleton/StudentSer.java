package com.java.test.singleton;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentSer {
	public static void main(String[] args) {

		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(
					new FileOutputStream("stuser.ser"));

			Student student = new Student(99, "test@gmail.com",
					98768764);
			//Student.sname="abcd";
			objectOutputStream.writeObject(student);

			System.out.println("Before serialization: " + student);
			System.out.println("Serialized !!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
