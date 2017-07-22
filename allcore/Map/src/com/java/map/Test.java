/**
 * 
 */
package com.java.map;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class Test {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		new GenTest().findHashCode("a");
		new GenTest().findHashCode(4);

	}
}

class GenTest<K> {

	K k;

	public void findHashCode(K k) {
		this.k = k;

		System.out.println(k.hashCode());
	}

}
