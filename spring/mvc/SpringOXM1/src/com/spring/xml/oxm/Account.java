package com.spring.xml.oxm;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Account {

	private int accno;
	private String atype;
	private double bal;

	public Account() {
		
	}

	public Account(int accnoe, String atype, double bal) {
		super();
		this.accno = accnoe;
		this.atype = atype;
		this.bal = bal;
	}

	public int getAccnoe() {
		return accno;
	}

	public void setAccnoe(int accnoe) {
		this.accno = accnoe;
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
