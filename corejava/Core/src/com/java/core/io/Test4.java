package com.java.core.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test4 {
	public static void main(String[] args) {

		try {
			FileOutputStream fileOutputStream = new FileOutputStream(
					"/home/dhiraj/Person.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(
					fileOutputStream);
			Person person = new Person(99, "Singh", "singh@gmail.com",
					"12345");
			Person.uid = 99999;
			System.out.println(person);
			objectOutputStream.writeObject(person);
			System.out.println("Serilized");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

class Parent {
	transient int sid = 99;
	transient String sname = "xxxxx";

	public Parent() {
		// TODO Auto-generated constructor stub
	}

	public Parent(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return sid + " " + sname;
	}

}

class Person extends Parent implements Serializable {
	int pid;
	String pname;
	String email;
	String phone;
	static int uid;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int pid, String pname, String email, String phone) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.email = email;
		this.phone = phone;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return pid + " " + pname + "  " + email + " " + phone + " " + sid + " "
				+ sname;
	}

}
