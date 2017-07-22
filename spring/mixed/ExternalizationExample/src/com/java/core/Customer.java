package com.java.core;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Customer implements Externalizable {

	private int cid;
	private String cname;
	private String email;
	private long phone;

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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return cid + " " + cname + " " + email + " " + phone;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(cid);
		out.writeObject(cname);
		// out.writeObject(email);
		// out.writeLong(phone);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		cid = in.readInt();
		cname = in.readObject().toString();
		// email = in.readObject().toString();
		// phone = in.readLong();

	}

}
