package com.java.core;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream(
					"src/data.txt");
			FileOutputStream fileOutputStream = new FileOutputStream(
					"src/data1.txt");
			while (fileInputStream.read() != -1) {
				fileOutputStream.write(fileInputStream.read());
				// System.out.print();
			}
			fileOutputStream.flush();
			fileInputStream.close();
			fileOutputStream.close();

			/*FileReader fileReader = new FileReader("src/data.txt");
			FileWriter fileWriter = new FileWriter("src/data1.txt");

			while (fileReader.read() != -1) {
				fileWriter.write((char)fileReader.read());
				// System.out.print(fileReader.read());
			}
			fileReader.close();
			fileWriter.close();*/

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
