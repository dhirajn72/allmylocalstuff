package com.java.core.collectionframework.comparator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Test7 {
	public static void main(String[] args) {
		TreeSet<Account> treeSet = new TreeSet<Account>(new SIDComparator());
		treeSet.add(new Account(99, "Singh"));
		treeSet.add(new Account(78, "dk"));
		treeSet.add(new Account(76, "kumar"));
		treeSet.add(new Account(34, "harish"));
		treeSet.add(new Account(53, "dhiraj"));
		treeSet.add(new Account(77, "raju"));

		Iterator<Account> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}

class Student {
	int sid;
	String name;

	public Student() {

	}

	public Student(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return sid + " " + name;
	}

}class Account {
	int sid;
	String name;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Account(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}



	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return sid + " " + name;
	}

}

class SIDComparator implements Comparator {
	@Override
	public int compare(Object obj1, Object obj2) {
		if (obj1 instanceof Account && obj2 instanceof Account) {
			Account st1 = (Account) obj1;
			Account st2 = (Account) obj2;
			return st1.name.compareTo(st2.name);
		}
		return 0;
	}
}
