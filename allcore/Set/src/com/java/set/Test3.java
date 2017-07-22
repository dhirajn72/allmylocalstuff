/**
 * 
 */
package com.java.set;

import java.util.HashSet;
import java.util.NavigableSet;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class Test3 {
	public static void main(String[] args) {

		String s1 = "FB";
		String s2 = "Ea";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.hashCode() == s2.hashCode());
		System.out.println(s1.equals(s2));

	}

}
