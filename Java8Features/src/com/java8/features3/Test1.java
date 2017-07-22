package com.java8.features3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.java8.features1.interface1.inter1;

public class Test1 {

	public static void main(String[] args) {

		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		Map<Integer, Integer> items2 = new HashMap<Integer, Integer>();
		items2.put(2, 10);
		items2.put(4, 20);
		items2.put(5, 30);
		items2.put(6, 40);
		items2.put(8, 50);
		items2.put(1, 60);

		List<String> list1 = new ArrayList<String>();
		list1.add("dhiraj");
		list1.add("singh");
		list1.add("kumar");
		list1.add("sri");

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(45);
		list2.add(65);
		list2.add(32);
		list2.add(62);

		// Before java 8

		System.out.println("*****Before Java 1.8*****");
		Set<String> keySet = (Set<String>) items.keySet();

		for (String key : keySet) {
			System.out.println(key + "---->" + items.get(key));
		}
		System.out.println("*******Integers*******");
		Set<Integer> keySet2 = (Set<Integer>) items2.keySet();

		for (Integer key : keySet2) {
			System.out.println(key + "---->" + items2.get(key));
		}
		System.out.println("****From Java 1.8******");
		items.forEach((key, value) -> {
			System.out.println(key + "---->" + value);
		});

		System.out.println("*******Integers*******");
		items2.forEach((key, value) -> {
			System.out.println(key + "---->" + value);
		});

		System.out.println("****Iteration on list From Java 1.8******");
		list1.stream().forEach((k) -> {
			System.out.println(k);
		});
		System.out.println("****************");
		list1.forEach((k) -> {
			System.out.println(k);
		});
		System.out.println("*****option 1*****");
		list2.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
		System.out.println("*****option 2*****");
		list2.stream().filter(i -> i % 2 == 0).forEach(i -> {
			System.out.println(i);
		});

	}
}
