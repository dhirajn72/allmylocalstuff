package com.java.core.collectionframework.comparator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Test17 {
	public static void main(String[] args) {

		try {
			FileReader fileReader = new FileReader("/home/dhiraj/Test15.java");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while (true) {
				String st= bufferedReader.readLine();
				System.out.println(st);
				if (st==null)
					break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
