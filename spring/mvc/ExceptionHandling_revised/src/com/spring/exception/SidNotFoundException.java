package com.spring.exception;

public class SidNotFoundException extends RuntimeException {
	private String sid;

	public SidNotFoundException() {
		// TODO Auto-generated constructor stub
	}

	public SidNotFoundException(String sid) {
		super();
		this.sid = sid;
	}

	@Override
	public String getMessage() {
		return toString();
	}

	@Override
	public String toString() {
		String msg = "Sid not found";
		if (sid != null) {
			msg = "Sid " + sid + " not found";
		}
		return msg;
	}
}
