package com.java.core.io.externalization;

import java.io.Externalizable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Test1 {

	public static void main(String[] args) {

		try {
			FileOutputStream fileOutputStream = new FileOutputStream(
					"/home/dhiraj/Person.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(
					fileOutputStream);
			Person person = new Person(99, "Singh", "singh@gmail.com", "999999");
			objectOutputStream.writeObject(person);
			System.out.println("Serilized");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

class Person implements Externalizable {
	int pid;
	String pname;
	String email;
	String phone;

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

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {

		out.writeInt(pid);
		out.writeObject(pname);
		out.writeObject(email);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {

		pid = in.readInt();
		pname = in.readObject().toString();
		email = in.readObject().toString();
		//phone = in.readObject().toString();

	}

	@Override
	public String toString() {
		return pid + " " + pname + " " + email + " " + phone;
	}
}