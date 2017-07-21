package com.spring.core;

public class WorkShop {
	private String name;
	private int size;
	private String date;
	private double fee;

	public WorkShop() {
		// TODO Auto-generated constructor stub
	}

	public WorkShop(String name, int size, String date, double fee) {
		super();
		this.name = name;
		this.size = size;
		this.date = date;
		this.fee = fee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return name + " " + size + " " + date + " " + fee;
	}
}
