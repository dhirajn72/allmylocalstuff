package com.jlcindia.xml;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Account {

	private int accno;
	private String atype;
	private double bal;

	public Account() {

	}

	public Account(int accno, String atype, double bal) {
		super();
		this.accno = accno;
		this.atype = atype;
		this.bal = bal;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getAtype() {
		return atype;
	}

	public void setAtype(String atype) {
		this.atype = atype;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	@Override
	public String toString() {
		return this.accno + " " + this.atype + " " + this.bal;
	}

}
