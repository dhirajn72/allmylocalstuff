package com.spring.propertyeditorsupport;

import java.util.List;

public class Student {

	private StudentID studentID;
	private String sname;
	private String email;
	private String phone;
	private int age;

	private List<String> emails;
	private List<String> phones;

	public Student() {

	}

	public Student(StudentID studentID, String sname, String email,
			String phone, int age) {
		super();
		this.studentID = studentID;
		this.sname = sname;
		this.email = email;
		this.phone = phone;
		this.age = age;
	}

	public StudentID getStudentID() {
		return studentID;
	}

	public void setStudentID(StudentID studentID) {
		this.studentID = studentID;
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

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID.getBid() + "-"
				+ studentID.getSid() + ", sname=" + sname + ", email=" + email
				+ ", phone=" + phone + ", age=" + age + ", emails=" + emails
				+ ", phones=" + phones + "]";
	}

}
