package com.hibernate.core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "accno")
	private int accno;

	@Column(name = "branch")
	private String branch;

	@Column(name = "branchCode")
	private String branchCode;

	@Column(name = "city")
	private String city;

	public Account() {

	}

	public Account(String branch, String branchCode, String city) {
		super();
		this.branch = branch;
		this.branchCode = branchCode;
		this.city = city;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return this.accno + " " + this.branch + " " + this.branchCode + " "
				+ this.city;
	}

}
