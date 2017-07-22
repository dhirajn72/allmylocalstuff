package com.jaxb2.xml;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Account {

	private int accno;
	private String aType;
	private double balance;

	public Account() {

	}

	public Account(int accno, String aType, double balance) {
		super();
		this.accno = accno;
		this.aType = aType;
		this.balance = balance;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getaType() {
		return aType;
	}

	public void setaType(String aType) {
		this.aType = aType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return  accno + " " + aType + " "
				+ balance  ;
	}

}
