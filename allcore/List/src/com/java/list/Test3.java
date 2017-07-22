/**
 * 
 */
package com.java.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class Test3 {
	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("ranjan");
		arrayList.add("lohar");
		arrayList.add("alok");
		arrayList.add("sri");
		arrayList.add("nivas");
		System.out.println(arrayList);
		Collections.sort(arrayList,new StringComp());
		System.out.println(arrayList);

	}

}

class StringComp implements Comparator {
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if (o1 instanceof String && o2 instanceof String) {
			String s1 = (String) o1;
			String s2 = (String) o2;
			return s2.compareTo(s1);
		}
		return 0;
	}
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	/*@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (o instanceof String) {
			String s1 = (String) o;
			return this.toString().compareTo(s1.toString());
		}
		return 0;
	}*/
}
