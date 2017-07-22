/**
 * 
 */
package com.spring.commad;

/**
 * @author Dhiraj Kumar
 * @website www.facebook.com/dhiraj.singh.90
 */
public class StudentCommand {

	private String sid;

	/**
	 * 
	 */
	public StudentCommand() {
		// TODO Auto-generated constructor stub
	}

	public StudentCommand(String sid) {
		super();
		this.sid = sid;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
		return sid;
	}

}
