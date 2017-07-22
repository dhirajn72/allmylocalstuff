package com.spring.commands;

public class SidNotFoundException extends RuntimeException {
	private String sid;

	public SidNotFoundException(String sid) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String msg = "Student not found";
		if (sid != null) {
			msg = "Student id " + sid + " not found";
		}

		return msg;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return toString();
	}

}
