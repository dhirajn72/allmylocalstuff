package com.hibernate.pk;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CustID implements Serializable {

	private String bid;
	private String cid;

	public CustID() {
		// TODO Auto-generated constructor stub
	}

	public CustID(String bid, String cid) {
		super();
		this.bid = bid;
		this.cid = cid;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

}
