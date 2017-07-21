package com.java.test.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test3 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fis = new FileOutputStream(new File(
				"/home/dhiraj/MyWorkSpace/workspace/CoreJavaTest/src/stu.ser"));
		ObjectOutputStream oos = new ObjectOutputStream(fis);
		Adress adress = new Adress("palya", "ka", "India", 560097);

		Student student = new Student(99, "dhiraj", 6987546, "B-1", adress);
		oos.writeObject(student);
		System.out.println("Serialized object !!");

	}

}

class Student implements Serializable {
	int sid;
	transient String name;
	transient long phone;
	static String batch;
	Adress adress;

	public Student(int sid, String name, long phone, String batch, Adress adress) {
		super();
		this.sid = sid;
		this.name = name;
		this.phone = phone;
		this.batch = batch;
		this.adress = adress;
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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public static String getBatch() {
		return batch;
	}

	public static void setBatch(String batch) {
		Student.batch = batch;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", phone=" + phone
				+ ", adress=" + adress + "]";
	}

}

// class Adress implements Serializable {
class Adress {

	String street;
	String state;
	String Country;
	long zipCode;

	public Adress(String street, String state, String country, long zipCode) {
		super();
		this.street = street;
		this.state = state;
		Country = country;
		this.zipCode = zipCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public long getZipCode() {
		return zipCode;
	}

	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Adress [street=" + street + ", state=" + state + ", Country="
				+ Country + ", zipCode=" + zipCode + "]";
	}

}