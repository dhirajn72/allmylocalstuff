package com.spring.events;

public class Batch {
	private String bid;
	private String bname;
	private String strength;
	private String date;

	public Batch() {

	}

	public Batch(String bid, String bname, String strength, String date) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.strength = strength;
		this.date = date;
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

	public String getStrength() {
		return strength;
	}

	public void setStrength(String strength) {
		this.strength = strength;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "New Batch going to start:" + bid + ",\nbname=" + bname
				+ ", \nstrength=" + strength + ", \ndate=" + date;
	}

}
