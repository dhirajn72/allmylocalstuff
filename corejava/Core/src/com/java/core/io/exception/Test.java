package com.java.core.io.exception;

public class Test {

	public static void main(String[] args) {

		try {
			new StudentService().getNameBySid(null);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class StudentService {

	String getNameBySid(String sid) throws StudentNotFoundException{

		if (sid == null || sid.isEmpty() || !sid.equals("JLC-99")) {
			throw new StudentNotFoundException(sid);
		}

		return "singh";
	}
}

class StudentNotFoundException extends Exception {

	public StudentNotFoundException(String sid) {
		super(sid);
	}

}
