package com.java.core.collectionframework.comparator;

import java.util.StringTokenizer;

public class Test16 {
public static void main(String[] args) {
	String str="Hi This is JLC, Java Learning Center";
	StringTokenizer stringTokenizer=new StringTokenizer(str,",");
	/*while(stringTokenizer.hasMoreElements()){
		System.out.println(stringTokenizer.nextElement());
	}
	System.out.println("****************");
	while(stringTokenizer.hasMoreTokens()){
		System.out.println(stringTokenizer.nextToken());
	}*/
	System.out.println("****************");
	
	while(stringTokenizer.hasMoreElements()){
		System.out.println(stringTokenizer.nextElement());
	}
	
	
}
}
