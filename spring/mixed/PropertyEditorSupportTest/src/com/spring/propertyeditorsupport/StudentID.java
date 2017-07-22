package com.spring.propertyeditorsupport;

public class StudentID {

	private int sid;
	private String bid;

	public StudentID() {
		// TODO Auto-generated constructor stub
	}

	public StudentID(int sid, String bid) {
		super();
		this.sid = sid;
		this.bid = bid;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	@Override
	public String toString() {
		return sid + " " + bid;
	}

}
