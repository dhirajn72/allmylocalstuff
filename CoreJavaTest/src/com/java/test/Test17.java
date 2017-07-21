package com.java.test;

import java.util.StringTokenizer;

public class Test17 {
	public static void main(String[] args) throws Throwable {
		String str = "I am a java developer and I work for Google";
		
		//Using split method
		String[] arr = str.split(" ");
		for(String s:arr){
			System.out.println(s);
		}
		System.out.println("********************");
		//using stringtokenizer class
		
		StringTokenizer stringTokenizer= new StringTokenizer(str, " ");
		while(stringTokenizer.hasMoreTokens()){
			System.out.println(stringTokenizer.nextElement());
		}
		
		
		
		

	}
}
