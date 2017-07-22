/**
 * 
 */
package com.java.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class Test1 {
	public static void main(String[] args) {

		PriorityQueue priorityQueue = new PriorityQueue(3, new SBComparator());
		priorityQueue.add(new StringBuilder("hai"));
		priorityQueue.add(new StringBuilder("hello"));
		priorityQueue.add(new StringBuilder("sri"));
		priorityQueue.add(new StringBuilder("nivas"));

		System.out.println(priorityQueue);

	}
}

class SBComparator implements Comparator {
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof StringBuilder && o2 instanceof StringBuilder) {
			String s1 = o1.toString();
			String s2 = o2.toString();
			System.out.println(s1 + " " + s1);
			return s1.compareTo(s2);

		}
		return 0;
	}

}
