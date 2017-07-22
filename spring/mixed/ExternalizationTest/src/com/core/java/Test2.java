package com.core.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test2 {

	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream(
					"/home/dhiraj/stu.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(
					fileInputStream);
			Object student = objectInputStream.readObject();

			System.out.println(student);
			System.out.println("DeSerialized..");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
