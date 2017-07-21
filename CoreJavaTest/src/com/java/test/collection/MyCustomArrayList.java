package com.java.test.collection;

import java.util.Arrays;

class CustomeArrayList<E> {

	private static final int INITIAL_CAPACITY = 10;
	int size = 0;
	private Object[] arrayList;

	public CustomeArrayList() {
		arrayList = new Object[INITIAL_CAPACITY];
	}

	public void add(E element) {
		if (size == arrayList.length) {
			increaseSize();
		}
		arrayList[size] = element;
		size++;
		
		// This code will restrict adding duplicates in List
		 /*if(!Arrays.asList(arrayList).contains(element)){
				arrayList[size] = element;
				size++;
		 }*/
		
 

	}

	public Object remove(int index) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index: " + index + " size: "
					+ size);
		}
		Object removedElement = arrayList[index-1];
		for (int i = index-1; i < size; i++) {
			arrayList[i] = arrayList[i + 1];

		}
		size--;
		return removedElement;
	}

	@SuppressWarnings("unchecked")
	public E get(int index) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index: " + index + " size: "
					+ size);
		}
		return (E) arrayList[index - 1];
	}

	private void increaseSize() {
		arrayList = Arrays.copyOf(arrayList, INITIAL_CAPACITY * 2);
	}

	public int size() {
		return size;
	}

	public void display() {
		for (int i = 0; i < arrayList.length; i++) {
			System.out.println("Element[" + i + "]" + arrayList[i]);
		}

	}

}

public class MyCustomArrayList {
	public static void main(String[] args) {
		CustomeArrayList<String> arrayList = new CustomeArrayList<String>();
		arrayList.add("DK");
		arrayList.add("DK");
		arrayList.add("DK");
		arrayList.add("kumar");
		arrayList.add("singh");
		arrayList.add("ram");
		arrayList.add("sita");

		System.out.println(arrayList.size());
		arrayList.display();
		System.out.println("******");
		System.out.println(arrayList.remove(7));
		arrayList.display();
		System.out.println("*******");
		System.out.println(arrayList.get(4));
		int x=90;
		Integer it =x;
		

	}
}
