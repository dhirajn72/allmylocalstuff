package com.hibernate.test;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class SID implements Serializable {
	private String bid;
	private int sid;

	public SID() {
		// TODO Auto-generated constructor stub
	}

	public SID(String bid, int sid) {
		super();
		this.bid = bid;
		this.sid = sid;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
		return bid + " " + sid;
	}

}
