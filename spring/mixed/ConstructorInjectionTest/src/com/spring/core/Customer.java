/**
 * 
 */
package com.spring.core;

/**
 * @author Dhiraj Kumar
 * @website www.facebook.com/dhiraj.singh.90
 */
public class Customer {
	private int cid;
	private String cname;

	/**
	 * 
	 */
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return cid + " " + cname;
	}

}
