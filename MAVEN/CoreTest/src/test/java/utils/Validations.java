package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Properties;
import java.util.Scanner;

public class Validations {

	// MAKE THIS CLASS SINGLETON

	// private int frame;
	ArrayList<String> list = new ArrayList<String>();
	LinkedHashMap<String, ArrayList<String>> lhm = new LinkedHashMap<String, ArrayList<String>>();

	public Validations() {
		System.out.println("DC");
	}

	public Validations(String val) throws IOException {

		// addPreRunData(new ArrayList());

		// create an list with acfs file names "test1"

		ArrayList alist = new ArrayList();
		alist.add("tests.PKG");
		alist.add("tests1.PKG");

		// createPackageMethod(new ArrayList(),"tests1");
		createPreRunFileForTarget(
		/* "F:\\codeworkspace\\CodeFrame\\CONFIG\\" */"/home/dhiraj",
				"TestingTargetDoc.dat", alist);

	}

	/**
	 * 
	 * @param frameInterval
	 * @return
	 */
	public boolean validateFrameInterval(String frameInterval) {

		if (Integer.parseInt(frameInterval) / 25 == 0)
			return true;
		else
			return false;

	}

	/**
	 * Accessing preRun data from the file
	 * 
	 * @param key
	 * @return
	 */
	public ArrayList<String> getPreRunData(String key) {
		LinkedHashMap<String, ArrayList<String>> hmap = getPreRunDataFromFile();

		return hmap.get(key);

	}

	/**
	 * Adding prerun data to the linkedHashMap
	 * 
	 * @param tableRow
	 */
	public void addPreRunData(ArrayList tableRow) {
		// lhm size of the object
		int size = lhm.size();

		lhm.put("Data" + (size + 1), tableRow);

		// saveData(tableRow);

		ArrayList al = new ArrayList();
		al.add("1");
		al.add("2");

		al.add("3");

		al.add("4");
		al.add("5");
		al.add("6");

		al.add("7");

		al.add("8");
		al.add("9");
		al.add("10");

		al.add("11");

		al.add("12");

		try {
			saveData(al);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Saving preRun data into a file
	 * 
	 * @param al
	 * @throws IOException
	 */

	// TODO GET THE FILE NAME
	private void saveData(ArrayList al) throws IOException {

		// TODO CHANGE THE FILE PATH
		File saveDataFile = new File("E:\\FrameFile.txt");
		Writer fw = null;
		BufferedWriter outStream = null;
		try {
			fw = new FileWriter(saveDataFile, false);
			outStream = new BufferedWriter(fw);

			// BufferedWriter bufferFileWriter = new BufferedWriter(fw);

			outStream
					.write("Source_Address RX Mapping Destination_Address RX Mapping VLAN_TAG RX Mapping Stream_id  RX Mapping Sub_Type  RX Mapping ");
			outStream.newLine();

			for (int k = 0; k < al.size(); k++) {
				outStream.write(al.get(k).toString());
				outStream.write("\t");
			}
			outStream.write("\n");
			System.out.println("Data is saved");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			outStream.close();

			fw.close();

		}
	}

	private LinkedHashMap<String, ArrayList<String>> getPreRunDataFromFile() {
		return null;
	}

	/**
	 * Creation of package and adding acf files into it
	 * 
	 * @param acfFiles
	 * @param packageFilename
	 * @throws IOException
	 */
	public void createPackageMethod(ArrayList<String> acfs,
			String packageFilename) throws IOException {

		try {
			// BufferedWriter bw=null;
			ArrayList alis = new ArrayList();
			alis.add("sample1.acf");
			alis.add("sample2.acf");
			alis.add("sample3.acf");
			alis.add("sample4.acf");
			alis.add("sample5.acf");

			/*
			 * File pkgFolder = new File(
			 * "F:\\codeworkspace\\CodeFrame\\CONFIG\\package" );
			 */
			File pkgFolder = new File("/home/dhiraj/CodeFrame/CONFIG/package");
			System.out.println("pkgFolder created" + pkgFolder);

			if (!pkgFolder.exists()) {
				pkgFolder.mkdirs();
			}

			if (pkgFolder.isDirectory()) {
				File[] dirs = pkgFolder.listFiles();
				System.out.println(dirs);
				if (dirs.length > 64) {
					// new ShowDialog()
					// .showAlertDialog("Alert !!! Max package should be 64");
					// System.exit(0);

				} else {
					System.out.println("my implemetation starts here");
					String path = pkgFolder + "/" + packageFilename;// in linux,
																	// in
																	// windows
																	// use "//"
					System.out.println(path);

					File pkgFile = new File(path);
					File acfFolder = new File(
					/* "F:\\codeworkspace\\CodeFrame\\CONFIG\\acf" */
					"//home//dhiraj//CodeFrame//CONFIG//acf" + "//"
							+ packageFilename);// pointion to properties file
					PrintWriter fw = new PrintWriter(acfFolder);
					System.out.println("writing in file");
					for (String ob : acfs) {
						String ele = ob + "=" + acfs.size();
						System.out.println(ele);
						fw.println(ele);
						fw.flush();

					}
					fw.close();
					System.out.println("my implementation ends here");

					/*
					 * File[] acfFiles=acfFolder.listFiles(); for(File
					 * acf:acfFiles) { alist.add(acf);
					 * 
					 * 
					 * }
					 */
					// int acfSize= alist.size();

					int acfSize = alis.size();

					if (acfSize <= 16) {
						// File file1 = new File( packageFilename+".pkg");
						FileWriter filewriter = new FileWriter(pkgFile);
						BufferedWriter bufferedwriter = new BufferedWriter(
								filewriter);
						bufferedwriter.write("BYTE  VALUE INCR");
						bufferedwriter.newLine();
						for (int i = 0; i < alis.size(); i++) {

							/*
							 * File acf = new File(acfFolder + File.separator +
							 * alis.get(i).toString());
							 */
							/*
							 * File acf = new File(acfFolder + File.separator +
							 * acfs.get(i).toString());
							 */

							/*
							 * BufferedReader bufferedReader = new
							 * BufferedReader( new FileReader(acf));
							 */
							/*
							 * BufferedReader bufferedReader = new
							 * BufferedReader( new FileReader(acf));
							 * 
							 * String content = bufferedReader.readLine(); while
							 * ((content = bufferedReader.readLine()) != null) {
							 * bufferedwriter.write(content);
							 * bufferedwriter.newLine(); }
							 * 
							 * bufferedReader.close();
							 */
						}
						/*
						 * bufferedwriter.close();
						 * 
						 * filewriter.close();
						 */
					} else {

						System.out.println("cannot addd more than 16 files");
						// new ShowDialog()
						// .showAlertDialog("Cannot add more than 16 acf files in same package");

					}

				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * getting acf files from the acf directory
	 * 
	 * @param args
	 * @throws IOException
	 */

	/*
	 * public ArrayList getacfFiles() throws FileNotFoundException { ArrayList
	 * alist=new ArrayList(); File f=new
	 * File("E:\\codeworkspace\\CodeFrame\\CONFIG\\acf"); if(f.isDirectory()) {
	 * 
	 * 
	 * File[] acfdirs=f.listFiles(); for(File acf:acfdirs) { alist.add(acf); }
	 * 
	 * } else { System.out.println("Acf files does not exist"); }
	 * 
	 * return alist; }
	 */

	/**
	 * Reading preRun data from file
	 * 
	 * @param targetFilePath
	 * @param targetFileName
	 * @throws IOException
	 */
	public void createPreRunFileForTarget(String targetFilePath,
			String targetFileName, ArrayList packages) throws IOException {

		preRunDataForTarget(targetFilePath, targetFileName);
		packageData(packages);
	}

	private void packageData(ArrayList pkglist) throws IOException {

		File pkgs = null;
		for (int indx = 0; indx < pkglist.size(); indx++) {
			pkgs = new File("F:\\codeworkspace\\CodeFrame\\CONFIG\\package\\"
					+ pkglist.get(indx).toString());
			// }
			BufferedReader bufferedReader1 = new BufferedReader(new FileReader(
					pkgs));
			ArrayList pkgValueCol = new ArrayList();
			String contentOfPkg = "";
			while ((contentOfPkg = bufferedReader1.readLine()) != null) {
				String tempFile = contentOfPkg;
				String[] c = tempFile.split(" ");
				pkgValueCol.add(c[1]);
			}
			bufferedReader1.close();
			int numberOfRows = pkgValueCol.size();
			String hexValueOfPkgRows = Integer.toHexString(numberOfRows);
			String headerStr = "0901" + hexValueOfPkgRows;

			TargetFileContents(headerStr, pkgValueCol);
		}
	}

	private void preRunDataForTarget(String targetFilePath,
			String targetFileName) throws IOException {
		ArrayList<String> srcaddtx = new ArrayList<String>();
		ArrayList<String> srcaddrx = new ArrayList<String>();
		ArrayList<String> destaddtx = new ArrayList<String>();
		ArrayList<String> destaddrx = new ArrayList<String>();
		ArrayList<String> vlantx = new ArrayList<String>();
		ArrayList<String> vlanrx = new ArrayList<String>();
		ArrayList<String> ethrtx = new ArrayList<String>();
		ArrayList<String> ethrrx = new ArrayList<String>();
		ArrayList<String> strmtx = new ArrayList<String>();
		ArrayList<String> strmrx = new ArrayList<String>();
		ArrayList<String> subtyptx = new ArrayList<String>();
		ArrayList<String> subtyprx = new ArrayList<String>();

		/*
		 * String path=System.getProperty("user.dir")+File.separator
		 * +CONSTANTS.CONFIG_FILE_FOLDER
		 * +File.separator+CONSTANTS.PRERUN_FILE_NAME
		 * +CONSTANTS.EXTN_PRERUN_DATA_FILE; File file=new File(path);
		 */
		File file = new File(
				/* "F:\\codeworkspace\\CodeFrame\\CONFIG\\preRun1.txt" */"/home/dhiraj/preRun1.txt");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		String contentsOfFile = "";
		int i = 0;
		while ((contentsOfFile = bufferedReader.readLine()) != null) {
			String temp = contentsOfFile;

			String[] s = temp.split(" ");

			srcaddtx.add(s[0]);
			srcaddrx.add(s[1]);
			destaddtx.add(s[2]);
			destaddrx.add(s[3]);
			vlantx.add(s[4]);
			vlanrx.add(s[5]);
			strmtx.add(s[6]);
			strmrx.add(s[7]);
			ethrtx.add(s[8]);
			ethrrx.add(s[9]);
			subtyptx.add(s[10]);
			subtyprx.add(s[11]);
		}
		bufferedReader.close();
		ArrayList<ArrayList> finalList = new ArrayList();
		finalList.add(srcaddtx);
		finalList.add(srcaddrx);
		finalList.add(destaddtx);
		finalList.add(destaddrx);
		finalList.add(vlantx);
		finalList.add(vlanrx);
		finalList.add(strmtx);
		finalList.add(strmrx);
		finalList.add(ethrtx);
		finalList.add(ethrrx);
		finalList.add(subtyptx);
		finalList.add(subtyprx);
		/*
		 * String targetFile=System.getProperty("user.dir")+targetFilePath
		 * +File.separator
		 * +CONSTANTS.TARGET_FILE_NAME+CONSTANTS.EXTN_PRERUN_DATA_FILE;
		 * 
		 * System.out.println("Validations.java createPreRunFileForTarget "+
		 * targetFile);
		 */

		// File targetFile=new
		// File("F:\\codeworkspace\\CodeFrame\\CONFIG\\TargetFile.txt");
		for (int finalCount = 0; finalCount < finalList.size(); finalCount++) {
			String tempStr = String.valueOf(finalCount);
			ArrayList tempList = finalList.get(finalCount);
			int NumberOfRows = 0;// calculate the size
			NumberOfRows = tempList.size();
			String hexaValueOfRows = "";
			hexaValueOfRows = Integer.toHexString(NumberOfRows);
			String headerStr = "";
			switch (tempStr) {
			case "0":
				headerStr = "0101" + hexaValueOfRows.trim();
				break;
			case "1":
				headerStr = "0102" + hexaValueOfRows.trim();
				break;
			case "2":
				headerStr = "0201" + hexaValueOfRows.trim();
				break;
			case "3":
				headerStr = "0202" + hexaValueOfRows.trim();
				break;
			case "4":
				headerStr = "0301" + hexaValueOfRows.trim();
				break;
			case "5":
				headerStr = "0302" + hexaValueOfRows.trim();
				break;
			case "6":
				headerStr = "0401" + hexaValueOfRows.trim();
				break;
			case "7":
				headerStr = "0402" + hexaValueOfRows.trim();
				break;
			case "8":
				headerStr = "0501" + hexaValueOfRows.trim();
				break;
			case "9":
				headerStr = "0502" + hexaValueOfRows.trim();
				break;
			case "10":
				headerStr = "0601" + hexaValueOfRows.trim();
				break;

			case "11":
				headerStr = "0602" + hexaValueOfRows.trim();
				break;

			}
			TargetFileContents(headerStr, tempList);
		}
	}

	private void packageController() {

	}

	private void timeStamp() {

	}

	/**
	 * Writing PreRun data into file for target
	 * 
	 * @param headerStr
	 * @param tempList
	 * @param targetFile
	 * @throws IOException
	 */
	public void TargetFileContents(String headerStr, ArrayList tempList)
			throws IOException {
		File targetFile = new File(
				"F:\\codeworkspace\\CodeFrame\\CONFIG\\TargetFile.txt");
		FileWriter fileWriter = new FileWriter(targetFile, true);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write(headerStr);
		// for loop tempList and write
		for (int contents = 0; contents < tempList.size(); contents++) {
			bufferedWriter.write(tempList.get(contents).toString());
			System.setOut(new PrintStream(targetFile));// this is added by me.
			System.out.println(tempList);

		}
		// bufferedWriter.newLine();
		bufferedWriter.close();
		fileWriter.close();
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		// Validations valid = new Validations("123");
		Validations valid = new Validations();
		ArrayList<String> list = new ArrayList<String>();
		list.add("sample1.acf");
		list.add("sample2.acf");
		list.add("sample3.acf");
		list.add("sample4.acf");
		list.add("sample5.acf");
		valid.createPackageMethod(list, "files.properties");
		System.out.println("main ends");

	}
}
