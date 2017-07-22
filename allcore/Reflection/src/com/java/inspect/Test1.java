/**
 * 
 */
package com.java.inspect;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class Test1 {
	public static void main(String[] args) {
		try {
			Class class1 = Class.forName("java.lang.Thread");
			Class class2 = class1.getSuperclass();
			System.out.println(class2);
			Class class3 = Class.forName("java.lang.Runnable");
			Class class4 = class3.getSuperclass();
			System.out.println(class4);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
