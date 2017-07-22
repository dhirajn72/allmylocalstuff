package com.java.core;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CountWordsInFile {
	public static void main(String[] args) {

		try {

			FileInputStream fileInputStream = new FileInputStream(
					"src/main/resources/data.txt");
			BufferedInputStream bufferedInputStream = new BufferedInputStream(
					fileInputStream);
			Scanner scanner = new Scanner(bufferedInputStream);
			List list = new ArrayList();
			while (scanner.hasNext()) {
				list.add(scanner.next());
			}
			Set set = new HashSet(list);
			for (Object ob : set) {
				System.out
						.println(ob + "-->" + Collections.frequency(list, ob));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
