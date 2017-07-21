package com.java.test.io;

import java.io.File;

public class Test1 {
	public static void main(String[] args) {
		File[] file = File.listRoots();
		for (File f : file) {
			long total = f.getTotalSpace();
			total = total / 1024 / 1024 / 1024;
			long usable = f.getUsableSpace();
			usable = usable / 1024 / 1024 / 1024;
			System.out.println("Total space is: " + total + "GB\n"
					+ "Available space is: " + usable+" GB");

		}

	}
}
