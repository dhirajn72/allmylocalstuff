/**
 * 
 */
package com.java.file.byteStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class Test1 {
	public static void main(String[] args) {

		try {
			FileInputStream fileInputStream = new FileInputStream(
					"/home/dhiraj/data.doc");
			BufferedInputStream bufferedInputStream = new BufferedInputStream(
					fileInputStream);

			while (/* bufferedInputStream.available()!=0 */true) {
				int x = bufferedInputStream.read();
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
