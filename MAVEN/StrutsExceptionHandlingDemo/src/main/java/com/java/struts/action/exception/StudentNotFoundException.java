package com.java.struts.action.exception;

public class StudentNotFoundException extends Exception {
	String sid;

	public StudentNotFoundException(String sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
		return sid + " Not available in Database";
	}

}
