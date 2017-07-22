/**
 * 
 */
package com.java.file.byteStream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class Test3 {
	public static void main(String[] args) {

		try {
			FileReader fileReader = new FileReader("/home/dhiraj/data.doc");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			FileWriter fileWriter = new FileWriter("/home/dhiraj/data1.doc");

			while (true) {
				int x = bufferedReader.read();
				if (x == -1)
					break;
				char ch = (char) x;
				fileWriter.write(x);
				fileWriter.flush();
				System.out.print(ch);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
