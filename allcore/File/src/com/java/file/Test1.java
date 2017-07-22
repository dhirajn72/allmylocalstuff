/**
 * 
 */
package com.java.file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FileTest().test("/home/dhiraj/names.txt");

	}
}

class FileTest {
	public void test(String fname) {
		FileInputStream fileInputStream = null;
		BufferedInputStream bufferedInputStream = null;
		String str = "";
		try {
			fileInputStream = new FileInputStream(fname);
			bufferedInputStream = new BufferedInputStream(fileInputStream);

			while (bufferedInputStream.available() != 0) {
				int x = bufferedInputStream.read();
				char ch = (char) x;
				// System.out.print(ch);
				str = str + ch;

			}
			System.out.println(str);
			List list = Arrays.asList(str.split(" "));
			Set set = new HashSet(list);

			for (Object s1 : set) {
				if (s1 instanceof String) {
					System.out.println(s1);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileInputStream != null)
					fileInputStream.close();
				if (bufferedInputStream != null)
					bufferedInputStream.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}

	}
}
