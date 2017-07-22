/**
 * 
 */
package com.spring.command;

/**
 * @author Dhiraj Kumar
 * @website www.facebook.com/dhiraj.singh.90
 */
public class StudentCommand {
	private int sid;
	private String sname;
	private String email;
	private String phone;
	private int age;

	public StudentCommand() {
	}

	public StudentCommand(String sname, String email, String phone, int age) {
		super();
		this.sname = sname;
		this.email = email;
		this.phone = phone;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return sid + " " + sname + " " + email + " " + phone + " " + age;
	}

}
