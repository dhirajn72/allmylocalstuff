package com.hibernate.client;

import com.hibernate.dao.StudentDAO;
import com.hibernate.dao.StudentDAOFactory;
import com.hibernate.persistence.WeekendStudent;

public class Test {
	public static void main(String[] args) {

		StudentDAO dao = StudentDAOFactory.getStudentDAO();
		WeekendStudent weekendStudent = new WeekendStudent("DK",
				"dk@gmail.com", "9743854499", "Singh", "singh@gmail.com",
				"9743854499", "kumar", "kumar@gmail.com", "9742765205");
		// dao.addStudent(weekendStudent);

		WeekendStudent student = (WeekendStudent) dao.getStudent(1);
		System.out.println(student);

	}

}
