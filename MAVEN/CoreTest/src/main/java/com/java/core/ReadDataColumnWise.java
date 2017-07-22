package com.java.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadDataColumnWise {
	public static void main(String[] args) {

		try {

			FileInputStream fis = new FileInputStream(new File(
					"src/main/resources/employee.txt"));// this line will read
														// data from
														// file and store in
														// FileInputStream
														// object

			Scanner sc = new Scanner(fis); // this line will read data from
											// FileInputStream
											// object and store in Scanner
											// object for easy file navigation

			FileWriter fw = new FileWriter("/home/dhiraj/newfile.txt");// this
																		// line
																		// is
																		// pointing
																		// to
																		// destination
																		// file
			int rowCount = 0;
			while (sc.hasNext()) {// here we are checking whether there is data
									// available in file or not, if yes then,

				String str = sc.nextLine();// here we are reading the complete
											// line and storing in String object

				String[] arr = str.split(" "); // here splitin the String on
												// using space,(single space)

				fw.write(arr[2] + "\n");// writing one by one rows of second
										// column in file
				fw.flush(); // flushing to file. This is mandatory.
				rowCount++; // counting the number of rows are written in file

			}
			System.out.println("Done!!! Check the destination file. It has "
					+ rowCount + " lines");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
