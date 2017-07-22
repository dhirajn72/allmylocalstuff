package com.java.core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CopyOfTest11 {
	public static void main(String[] args) throws Exception {
		ObjectInputStream objectInputStream = new ObjectInputStream(
				new FileInputStream("src/main/resources/data.ser"));
		Sub sub = (Sub) objectInputStream.readObject();
		System.out.println(sub);
		System.out.println("Done !!");

	}
}
