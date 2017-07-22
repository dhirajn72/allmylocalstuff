package com.java.core.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test2 {
	public static void main(String[] args) {

		try {
			FileOutputStream fileOutputStream = new FileOutputStream(
					"/home/dhiraj/stu.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(
					fileOutputStream);
			Student student = new Student(87, "Singh", 99999999);
			student.b = 99;
			objectOutputStream.writeObject(student);
			System.out.println("Object Serialized");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

class Student implements Serializable{
	int sid;
	transient String name;
	static int b;
	long phone;

	public Student(int sid, String name, long phone) {
		super();
		this.sid = sid;
		this.name = name;
		this.phone = phone;
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

	public static int getB() {
		return b;
	}

	public static void setB(int b) {
		Student.b = b;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return sid + " " + name + " " + phone;
	}

}