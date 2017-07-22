/**
 * 
 */
package com.java.file.byteStream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class Test2 {
	public static void main(String[] args) {

		try {
			FileInputStream fileInputStream = new FileInputStream(
					"/home/dhiraj/data.doc");

			InputStreamReader inputStreamReader = new InputStreamReader(
					fileInputStream);

			while (/* bufferedInputStream.available()!=0 */true) {
				int x = inputStreamReader.read();
				if (x == -1)
					break;
				char ch = (char) x;
				System.out.print(ch);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
