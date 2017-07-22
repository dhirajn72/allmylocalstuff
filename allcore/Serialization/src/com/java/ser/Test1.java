/**
 * 
 */
package com.java.ser;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class Test1 {
	public static void main(String[] args) {

		try {
			Student1 student = new Student1(101, "Sri", "sri@gmail.com",
					Long.parseLong("9743854499"));
			FileOutputStream fileOutputStream = new FileOutputStream(
					"/home/dhiraj/stu.ser");

			ObjectOutputStream objectOutputStream = new ObjectOutputStream(
					fileOutputStream);
			objectOutputStream.writeObject(student);
			/*
			 * objectOutputStream.writeInt(student.getSid());
			 * objectOutputStream.writeObject(student.getSname());
			 * objectOutputStream.close();
			 */System.out.println("Serialized");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class Student1 implements Serializable {

	private int sid;
	// private transient static String sname;
	private static String sname;
	private String email;
	private long phone;

	/**
	 * 
	 */
	public Student1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param sid
	 * @param sname
	 * @param email
	 * @param phone
	 */
	public Student1(int sid, String sname, String email, long phone) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.phone = phone;
	}

	/**
	 * @return the sid
	 */
	public int getSid() {
		return sid;
	}

	/**
	 * @param sid
	 *            the sid to set
	 */
	public void setSid(int sid) {
		this.sid = sid;
	}

	/**
	 * @return the sname
	 */
	public String getSname() {
		return sname;
	}

	/**
	 * @param sname
	 *            the sname to set
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phone
	 */
	public long getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(long phone) {
		this.phone = phone;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return sid + " " + sname + " " + email + " " + phone;
	}

}
