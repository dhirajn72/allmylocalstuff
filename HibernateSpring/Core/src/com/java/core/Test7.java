/**
 * 
 */
package com.java.core;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Dhiraj Kumar
 * @website www.facebook.com/dhiraj.singh.90
 */
public class Test7 {
	public static void main(String[] args) {
		CustomArrayList list = new CustomArrayList();
		System.out.println(list.size());
		list.add("Hello1");
		list.add("Hello2");
		list.add("Hello3");
		list.add("Hello4");
		list.add("Hello5");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("********");
		System.out.println(list.get(3));
		System.out.println("******");
		list.remove(4);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}

class CustomArrayList {

	private Object[] arr;
	private int size = 0;

	public CustomArrayList() {
		arr = new Object[10];
	}

	public void add(Object ob) {

		if (arr.length - size < 5) {
			increaseListSize();
		}
		arr[size++] = ob;
	}

	private void increaseListSize() {
		arr = Arrays.copyOf(arr, arr.length * 2);
	}

	public int size() {
		return size;
	}

	public Object get(int index) {

		if (index > size() - 1) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return arr[index];
	}

	public void remove(int index) {
		List<Object> objects = new LinkedList<Object>();
		for (Object ob : arr) {
			objects.add(ob);
		}

		objects.remove(index);
		arr = objects.toArray();
		size--;

	}

}