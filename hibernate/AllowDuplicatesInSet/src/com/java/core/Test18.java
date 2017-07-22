package com.java.core;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Test18 {
	public static void main(String[] args) {

		Set set = new HashSet();
		set.add(new Stu(11));
		set.add(new Stu(11));
		set.add(new Stu(11));
		set.add(new Stu(11));
		System.out.println("*******");
		System.out.println("set:" + set);
		for (Object obj : set) {
			System.out.println(obj);
		}

		System.out.println("*******");
		List<Stu> list = new ArrayList<Stu>();
		list.add(new Stu(10));
		list.add(new Stu(10));
		list.add(new Stu(10));
		list.add(new Stu(11));
		list.add(new Stu(10));
		list.add(new Stu(10));
		list.add(new Stu(10));
		list.add(new Stu(10));
		list.add(new Stu(10));
		System.out.println("list-1:" + list);

		List<Stu> list2 = new ArrayList<Stu>();
		for (Stu ob : list) {
			if (!list2.contains(ob)) {
				list2.add(ob);
			} else
				System.out.println("Its Duplicate:" + ob);
		}
		System.out.println("**********");
		System.out.println("list-2:" + list2);
		/*Set set2 = new LinkedHashSet(list2);
		System.out.println("Set-2:" + set2);*/

	}

}

class Stu {
	int sid;

	public Stu() {

	}

	public Stu(int sid) {
		super();
		this.sid = sid;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Stu) {
			Stu stu = (Stu) obj;
			return this.sid == stu.sid;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return 10;
	}

	@Override
	public String toString() {
		return sid + " ";
	}

}
