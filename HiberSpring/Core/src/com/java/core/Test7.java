package com.java.core;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test7 {
	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("src/jlc.ser");
			ObjectInputStream objectInputStream = new ObjectInputStream(
					fileInputStream);
			JLC jlc = (JLC) objectInputStream.readObject();
			System.out.println(jlc);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
