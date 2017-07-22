package com.java.core.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fileInputStream=new FileInputStream("/home/dhiraj/Test15.java");
			BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
			while(true){
				char ch=(char)bufferedInputStream.read();
				System.out.println(ch);
				if(bufferedInputStream.read()==-1)break;
			}
			System.out.println("Done");
		} catch (IOException e) {
	e.printStackTrace();	}
		
		

	}

}
