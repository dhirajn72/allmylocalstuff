package com.hibernate.dao;

import com.hibernate.persistence.Student;

public interface StudentDAO {

	void addStudent(Student student);

	void deleteStudent(int sid);

}
