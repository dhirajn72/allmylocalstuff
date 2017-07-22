package com.java.core;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Customer implements Externalizable {
	private int cid;
	private String cname;
	private String email;
	private String phone;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int cid, String cname, String email, String phone) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
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
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email
				+ ", phone=" + phone + "]";
	}

	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(cid);
		out.writeObject(cname);
		out.writeObject(phone);

	}

	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {

		cid = in.readInt();
		cname = in.readObject().toString();
		phone = in.readObject().toString();

	}

}
