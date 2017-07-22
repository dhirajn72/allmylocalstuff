package com.spring.service;

import com.spring.persistence.dao.StudentDAO;
import com.spring.persistence.dao.impl.StudentDAOImpl;

public class StudentDAOFactory {

	private static StudentDAO studentDAO;
	static {
		studentDAO = new StudentDAOImpl();
	}

	public static StudentDAO getstuStudentDAO() {
		return studentDAO;
	}

}
