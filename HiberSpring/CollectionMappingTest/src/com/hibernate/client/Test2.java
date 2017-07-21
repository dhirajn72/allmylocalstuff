package com.hibernate.client;

import com.hibernate.dao.DAOFactory;
import com.hibernate.dao.StudentDAO;

public class Test2 {
	public static void main(String[] args) {

		StudentDAO dao = DAOFactory.getStudentDAO();
		//dao.deleteStudent(5);

	}

}
