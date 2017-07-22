/**
 * 
 */
package com.java.string;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class Test3 {
	public static void main(String[] args) {

		String str1 = "Java learning center is best Java training center";
		String[] arr = str1.split("Java");
		for (String s1 : arr) {
			System.out.println(s1);
		}

		String string1 = "madam";
		String string2 = "";
		for (int i = 0; i < string1.length(); i++) {
			string2 = string2 + string1.charAt(i);
		}
		if (string1.equals(string2)) {
			System.out.println("Its palidrome");
		} else {
			System.out.println("Its Not palidrome");
		}

		System.out.println("**************");

		String string = "^[0-9][a-z]*";
		System.out.println("3dhiraj".matches(string));

	}
}
