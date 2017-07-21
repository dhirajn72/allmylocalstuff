package com.spring.core;

public class Batch {
	private int bid;
	private String bname;
	private String date;
	private int size;
	private double fee;

	public Batch() {
		// TODO Auto-generated constructor stub
	}

	public Batch(int bid, String bname, String date, int size, double fee) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.date = date;
		this.size = size;
		this.fee = fee;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return bid + " " + bname + " " + date + " " + size + " " + fee;
	}

}
