package com.java.core;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {

		CustomArrayList list = new CustomArrayList();
		// System.out.println(list.size());
		list.add("alok");
		list.add("ranjan");
		list.add("apple");
		list.add("dhiraj");
		list.add("singh");
		list.add("kumar");
		// System.out.println(list.size());
		// System.out.println(list.get(6));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "->" + list.get(i));
		}
		System.out.println("******");
		list.remove(6);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "->" + list.get(i));
		}

	}
}

class CustomArrayList {
	private Object[] arr;
	private int size = 0;

	public CustomArrayList() {
		arr = new Object[10];
	}

	public int size() {
		return size;
	}

	public void add(Object obj) {
		if (arr.length - size < 5) {
			increaseListSize();
		}
		arr[size++] = obj;
	}

	private void increaseListSize() {
		arr = Arrays.copyOf(arr, arr.length * 2);
	}

	public Object get(int index) {
		if (index > size() - 1) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return arr[index];
	}

	public void remove(int index) {
		if (index > size()-1) {
			throw new ArrayIndexOutOfBoundsException();
		}
		List list = new LinkedList();
		for (Object ob : arr) {
			list.add(ob);
		}
		list.remove(index);
		arr = list.toArray();
		size--;
	}
}
