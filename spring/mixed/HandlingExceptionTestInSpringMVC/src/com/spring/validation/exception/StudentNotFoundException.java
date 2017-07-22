package com.spring.validation.exception;

public class StudentNotFoundException extends RuntimeException {
	String sid;

	public StudentNotFoundException(String sid) {
		// TODO Auto-generated constructor stub
		super(sid);
		this.sid = sid;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return toString();
	}

	@Override
	public String toString() {
		return "Student not found "+sid;
	}

}
