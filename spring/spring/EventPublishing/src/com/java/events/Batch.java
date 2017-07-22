package com.java.events;

public class Batch {
	private String bid;
	private String bname;
	private String timings;
	private int size;
	private double fee;

	public Batch() {

	}

	public Batch(String bid, String bname, String timings, int size, double fee) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.timings = timings;
		this.size = size;
		this.fee = fee;
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

	public String getTimings() {
		return timings;
	}

	public void setTimings(String timings) {
		this.timings = timings;
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
		return bid + " " + bname + " " + timings + " " + size + " " + fee;
	}

}
