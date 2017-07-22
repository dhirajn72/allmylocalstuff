package com.java.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test5 {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<Person>();
		Person person = new Person(99, "dhiraj");
		Person person1 = new Person(99, "dhiraj");
		Person person2 = new Person(99, "dhiraj");

		set.add(person);
		set.add(person1);
		set.add(person2);
		System.out.println(set);

		System.out.println("**************");
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(new Integer(99), "hello");
		map.put(new Integer(99), "hello");
		map.put(new Integer(99), "hello");
		System.out.println(map);

	}

}

class Person {

	int pid;
	String pname;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}

	@Override
	public boolean equals(Object obj) {
		if ((this.pid == ((Person) obj).pid)
				&& (this.pname.equals(((Person) obj).pname))) {
			return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return pid + 25;
	}

	@Override
	public String toString() {
		return pid + " " + pname;
	}

}
