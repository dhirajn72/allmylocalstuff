package com.java.spring;

public class Batch {

	private String bid;
	private String bname;
	private String btimings;

	public Batch() {
		
	}

	public Batch(String bid, String bname, String btimings) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.btimings = btimings;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBtimings() {
		return btimings;
	}

	public void setBtimings(String btimings) {
		this.btimings = btimings;
	}

	@Override
	public String toString() {
		return bid + " " + bname + " " + btimings;
	}

}
