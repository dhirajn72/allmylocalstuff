package com.java.core;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Test20 {
	public static void main(String[] args) {

		List list = new ArrayList();

		try {
			FileInputStream fis = new FileInputStream(
					"src/main/resources/data.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			Scanner sc = new Scanner(bis);
			while (sc.hasNext()) {
				String st = sc.next();
				list.add(st);
			}

			Set set = new HashSet(list);
			for (Object o : set) {
				System.out.println(o + "-->>" + Collections.frequency(list, o));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
