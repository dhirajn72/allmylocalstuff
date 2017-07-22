package com.java.core;

import java.util.Collections;
import java.util.PriorityQueue;

public class Test5 {
	public static void main(String[] args) {

		PriorityQueue priorityQueue = new PriorityQueue();
		priorityQueue.add("dhiraj");
		priorityQueue.add("singh");
		priorityQueue.add("sri");
		priorityQueue.add("kumar");
		priorityQueue.add("nivas");
		priorityQueue.add("dande");
		priorityQueue.add("ranjan");
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.peek());
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);
		

	}
}
