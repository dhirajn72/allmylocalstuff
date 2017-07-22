package com.java.core.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test3 {
	public static void main(String[] args) {
		try {

			FileInputStream fileInputStream = new FileInputStream(
					"/home/dhiraj/stu.txt");
			BufferedInputStream bufferedInputStream = new BufferedInputStream(
					fileInputStream);
			ObjectInputStream objectInputStream = new ObjectInputStream(
					bufferedInputStream);
			Object ob = objectInputStream.readObject();
			System.out.println(ob);
			System.out.println("Deserialized");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
