package com.spring.event;

import java.util.Date;

public class Batch {

	private String batchId;
	private String batchName;
	private int batchSize;
	private Date date;

	public Batch() {
		// TODO Auto-generated constructor stub
	}

	public Batch(String batchId, String batchName, int batchSize, Date date) {
		super();
		this.batchId = batchId;
		this.batchName = batchName;

		this.batchSize = batchSize;
		this.date = date;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public int getBatchSize() {
		return batchSize;
	}

	public void setBatchSize(int batchSize) {
		this.batchSize = batchSize;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.batchId + " " + this.batchName + " " + this.batchSize + " "
				+ this.date;
	}

}
