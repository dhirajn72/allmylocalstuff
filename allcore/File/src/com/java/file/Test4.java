/**
 * 
 */
package com.java.file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
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
public class Test4 {
	public static void main(String[] args) {

		try {

			FileInputStream fileInputStream = new FileInputStream(
					"/home/dhiraj/data.doc");
			BufferedInputStream bufferedInputStream = new BufferedInputStream(
					fileInputStream);
			String str = "";
			while (bufferedInputStream.available() != 0) {

				int x = bufferedInputStream.read();
				char ch = (char) x;
				str = str + ch;
			}
			System.out.print(str);

			List<String> list = Arrays.asList(str.split(" "));
			Set<String> set = new HashSet<String>(list);
			for (String s1 : set) {
				System.out.println(s1 + "->" + Collections.frequency(list, s1));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
