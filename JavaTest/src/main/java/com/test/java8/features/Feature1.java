package com.test.java8.features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * This example covers newly introduced forEach() method 
 * of 
 * 
 * 
 * 
 * @author dhiraj
 *
 *
 */


public class Feature1 {

	public static void main(String[] args) {

		List<Integer> integers = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			integers.add(i);
		}
		
		System.out.println("## Using Iterator ");
		Iterator<Integer> iterator = integers.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("####### Using forEach method of iterable (anonymous class) ##########");

		integers.forEach(new Consumer<Integer>() {

			public void accept(Integer t) {
				System.out.println(t);
			}
		});
		
		System.out.println("#### Centralized code####");
		MyConsumer consumer= new MyConsumer();
		integers.forEach(consumer);
		
		

	}

}

class MyConsumer implements Consumer<Integer> {
	public void accept(Integer t) {
		System.out.println(t);
	}
}
