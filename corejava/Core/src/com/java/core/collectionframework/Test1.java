package com.java.core.collectionframework;

import java.util.ArrayList;
import java.util.Collection;

public class Test1 {

	public static void main(String[] args) {

		Collection col1 = new ArrayList();
		Collection col2 = new ArrayList();

		col1.add("SRI");
		col1.add("Nivas");
		col1.add("Dande");

		col2.add("SRI");
		col2.add("Nivas");
		col2.add("Dande");
		col2.add("dande");
		col2.add("aande");

		System.out.println(col1);
		System.out.println(col2);
		System.out.println(col2.retainAll(col1));
		System.out.println(col1);
		System.out.println(col2);

	}

}
