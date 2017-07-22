package com.java.core;

import java.util.HashSet;
import java.util.Set;

public class Test19 {
	public static void main(String[] args) {

		Set set = new HashSet();
		set.add(new Stu1(10, "dhiraj"));
		set.add(new Stu1(10, "dhiraj"));
		set.add(new Stu1(10, "dhiraj"));
		set.add(new Stu1(10, "dhiraj"));
		set.add(new Stu1(10, "dhiraj"));
		System.out.println(set);

	}
}

class Stu1 {
	int sid;
	String sname;

	public Stu1() {

	}

	public Stu1(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	public boolean equals(Object obj) {

		if (obj instanceof Stu1) {
			Stu1 stu1 = (Stu1) obj;
			if (this.sid == stu1.sid && this.sname.equals(stu1.sname))
				return false;
		}
		return false;
	}

	public int hashCode() {
		return this.sid;
	}

	@Override
	public String toString() {
		return sid + " " + sname;
	}

}
