/**
 * 
 */
package com.java.ser;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class Test4Des {
	public static void main(String[] args) {

		try {
			FileInputStream fileInputStream = new FileInputStream(
					"/home/dhiraj/stu.ser");

			ObjectInputStream objectInputStream = new ObjectInputStream(
					fileInputStream);
			Student student = (Student) objectInputStream.readObject();
			/*
			 * objectOutputStream.writeInt(student.getSid());
			 * objectOutputStream.writeObject(student.getSname());
			 * objectOutputStream.close();
			 */

			System.out.println(student);
			System.out.println("DeSerialized");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
