package com.spring.onetomany;

import java.util.List;

public interface StudentDAO {
	List<Student> getSubjectsByStudent(String sname);

	void saveStudent(Student st);

}
