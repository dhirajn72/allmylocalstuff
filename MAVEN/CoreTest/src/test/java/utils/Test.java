package utils;

import java.io.File;
import java.io.PrintWriter;
import java.util.Properties;

public class Test {
	public static void main(String[] args) throws Exception {
		File acfFolder = new File("//home//dhiraj//apple" + "//"
				+ "file.properties");
		PrintWriter fw = new PrintWriter(acfFolder);
		System.out.println("writing in file");
		fw.println("dk=6");
		fw.println("dk=6");

		fw.flush();
		fw.close();
		System.out.println("my implementation ends here");

	}

}
