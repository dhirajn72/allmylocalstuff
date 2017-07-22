package com.core.java;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Student implements Externalizable {
	private int sid;
	private String sname;
	private String email;
	private String phone;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname, String email, String phone) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return sid + " " + sname + " " + email + " " + phone;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(sid);
		out.writeObject(sname);
		out.writeObject(phone);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		sid = in.readInt();
		sname = in.readObject().toString();
		phone = in.readObject().toString();

	}

}