package com.hibernate.client;

import com.hibernate.dao.StudentDAO;
import com.hibernate.dao.StudentDAOFactory;
import com.hibernate.persistence.WeekendStudent;

public class Test {
	public static void main(String[] args) {

		StudentDAO dao = StudentDAOFactory.getStudentDAO();
		WeekendStudent weekendStudent = new WeekendStudent("DK",
				"dk@gmail.com", "12345", "Singh", "singh@gmail.com",
				"12345", "kumar", "kumar@gmail.com", "12345");
		weekendStudent.setSid(1);
		dao.addStudent(weekendStudent);

		/*
		 * WeekendStudent student = (WeekendStudent) dao.getStudent(1);
		 * System.out.println(student);
		 */

	}

}
