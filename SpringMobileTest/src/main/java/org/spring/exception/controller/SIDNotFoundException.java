package org.spring.exception.controller;

public class SIDNotFoundException extends RuntimeException {
	String sid;

	public SIDNotFoundException(String sid) {
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
		return "BOSS " + sid + "Not Found";
	}

}
