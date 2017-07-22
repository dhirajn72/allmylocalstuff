/**
 * 
 */
package com.java.ser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class Test2 {
	public static void main(String[] args) {

		try {
			FileInputStream fileInputStream = new FileInputStream(
					"/home/dhiraj/stu.ser");

			ObjectInputStream objectInputStream = new ObjectInputStream(
					fileInputStream);
			Student1 student = (Student1) objectInputStream.readObject();

			/*
			 * int student = objectInputStream.readInt(); String name =
			 * objectInputStream.readObject().toString();
			 * 
			 * System.out.println(student + " " + name);
			 */
			System.out.println(student);
			System.out.println("Deserialized");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}