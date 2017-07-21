package com.hibernate.dao;

import com.hibernate.persistence.StudentDAOImpl;

public class DAOFactory {
	private static final StudentDAO DAO;
	static {
		DAO = new StudentDAOImpl();
	}

	public static StudentDAO getStudentDAO() {
		return DAO;
	}

}
