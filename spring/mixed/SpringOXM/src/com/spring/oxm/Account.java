package com.spring.oxm;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Account {
	private String accno;
	private double bal;
	private String accType;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String accno, double bal, String accType) {
		super();
		this.accno = accno;
		this.bal = bal;
		this.accType = accType;
	}

	public String getAccno() {
		return accno;
	}

	public void setAccno(String accno) {
		this.accno = accno;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	@Override
	public String toString() {
		return accno + " " + bal + " " + accType;
	}

}
