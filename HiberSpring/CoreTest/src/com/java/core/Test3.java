package com.java.core;

import java.io.Externalizable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test3 {
	public static void main(String[] args) {
		Student student = new Student(99, "dhiraj", "dk@gmail.com",
				"9743854499");
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(
					"src/stud.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(
					fileOutputStream);
			objectOutputStream.writeObject(student);
			objectOutputStream.close();
			fileOutputStream.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class Student implements Externalizable{
	// private static transient int sid=88;
	private int sid;
	private String sname;
	private String email;
	private String phone;

	public Student() {
	}

	public Student(int sid, String sname, String email, String phone) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.phone = phone;
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
		return "Student [sid=" + sid + ", sname=" + sname + ", email=" + email
				+ ", phone=" + phone + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(sname);
		out.writeObject(email);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		sname=in.readObject().toString();
		email=in.readObject().toString();
		
	}

}
