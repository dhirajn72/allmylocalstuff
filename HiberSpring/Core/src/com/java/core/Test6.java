package com.java.core;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test6 {
	public static void main(String[] args) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(
					"src/jlc.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(
					fileOutputStream);
			JLC jlc = new JLC(99, "dhiraj", "dhiraj@gmail.com", "9743854499");
			objectOutputStream.writeObject(jlc);
			System.out.println("Check src folder.");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class JLC implements Serializable, Cloneable {
	private int sid;
	private String sname;
	private String email;
	private String phone;

	public JLC() {
		System.out.println("DC");
	}

	public JLC(int sid, String sname, String email, String phone) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.phone = phone;
		System.out.println("Arg");
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
	protected Object clone() throws CloneNotSupportedException {
		if (this instanceof Cloneable) {
			return new JLC(this.sid, this.sname, this.email, this.phone);
		}
		throw new CloneNotSupportedException();
	}

	@Override
	public String toString() {
		return sid + " " + sname + " " + email + " " + phone;
	}

}
