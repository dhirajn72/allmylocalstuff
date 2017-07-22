package com.java.core;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Set set = new HashSet();
		// Student st = new Student(11);
		set.add(new Student(11));
		set.add(new Student(11));
		set.add(new Student(11));

		System.out.println(set);

	}

}

class Student {
	int sid;

	public Student(int sid) {
		super();
		this.sid = sid;
	}

	@Override
	public String toString() {
		return sid + "";
	}

	@Override
	public int hashCode() {
		return sid;
	}

	@Override
	public boolean equals(Object obj) {
	/*	if(obj instanceof Student){
			return ((Student) obj).sid==this.sid;
		}*/
		
		return false;

	}

}