package com.java.test.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializableTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(new File(
				"/home/dhiraj/MyWorkSpace/workspace/CoreJavaTest/src/stu.ser"));
		ObjectInputStream oos = new ObjectInputStream(fis);

		Student student  = (Student)oos.readObject();
		System.out.println(student);
		System.out.println("DeSerialized object !!");

	}

}
