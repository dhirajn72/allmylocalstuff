package org.customArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		MyArrayList arrayList = new MyArrayList();
		arrayList.add("Hello");
		arrayList.add("Hai");
		arrayList.add("dhiraj");
		arrayList.add("kumar");
		arrayList.add("alok");
		arrayList.add("ranjan");
		System.out.println(arrayList.size());
		System.out.println(arrayList.get(3));
		System.out.println(arrayList.size());
		System.out.println("**********");
	}
}

class MyArrayList {

	private Object[] arr;
	private int size = 0;

	public MyArrayList() {
		arr = new Object[10];
	}

	public void add(Object ob) {
		if (arr.length - size <= 5) {
			increaseListSize();
		} else {
			arr[size++] = ob;
		}
	}

	public Object get(int index) {
		if (index < size) {
			return arr[index];
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}

	}

	private void increaseListSize() {
		arr = Arrays.copyOf(arr, arr.length * 2);

	}

	public int size() {
		return size;
	}

}