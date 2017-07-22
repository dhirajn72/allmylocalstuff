package com.java.core;

public class SID {
	private String bid;
	private int sid;

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

}
