package com.jlcindia.jaxb2;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Account {
	private double accno;
	private String atype;
	private double bal;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(double accno, String atype, double bal) {
		super();
		this.accno = accno;
		this.atype = atype;
		this.bal = bal;
	}

	public double getAccno() {
		return accno;
	}

	public void setAccno(double accno) {
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
		return accno + " " + atype + " " + bal;
	}

}
