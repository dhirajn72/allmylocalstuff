package com.java.test.serializable;

import java.io.Externalizable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class SerializableTest {
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

class Student implements Externalizable {
	int sid;
	String name;
	long phone;
	static String batch;
	Adress adress;

	public Student() {
		System.out.println("Student() - DC");
	}

	public Student(int sid, String name, long phone, String batch, Adress adress) {
		super();
		System.out.println("Student()- argumented constructor");
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

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(sid);
		out.writeObject(name);
		/*
		 * out.writeObject(adress.street); out.writeLong(adress.zipCode);
		 */

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		sid = in.readInt();
		name = in.readObject().toString();
		/*
		 * adress = new Adress(); adress.street = in.readObject().toString();
		 * adress.zipCode = in.readLong();
		 */
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
		System.out.println("Adress()- argumented constructor");
		this.street = street;
		this.state = state;
		Country = country;
		this.zipCode = zipCode;
	}

	public Adress() {
		System.out.println("Adress() -DC");
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