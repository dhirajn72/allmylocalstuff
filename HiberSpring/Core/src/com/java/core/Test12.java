package com.java.core;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test12 {
	public static void main(String[] args) {

		MyArrayList list = new MyArrayList();
		System.out.println(list.size());
		System.out.println("***********");
		list.add("hi");
		list.add("dhiraj");
		list.add("how");
		list.add("are");
		list.add("you");
		list.add("doing");
		list.add("alok");

		System.out.println(list.size());
		System.out.println(list.get(2));
		System.out.println("*********");
		// System.out.println(list.get(7));//java.lang.IndexOutOfBoundsException

	}
}

class MyArrayList {
	private Object[] arr;
	private int size = 0;

	public MyArrayList() {
		arr = new Object[10];
	}

	public int size() {
		return size;
	}

	public void add(Object element) {
		if (arr.length - size < 5) {
			increaseListSize();
		}
		arr[size++] = element;
	}

	private void increaseListSize() {
		arr = Arrays.copyOf(arr, arr.length * 2);
	}

	public void remove(int index) {
		List list = new LinkedList();
		for (Object ob : arr) {
			list.add(ob);
		}

		list.remove(index);
		arr = list.toArray();
		size--;
	}

	public Object get(int index) {
		if (index > size() - 1) {
			throw new IndexOutOfBoundsException();
		}
		return arr[index];
	}

}
