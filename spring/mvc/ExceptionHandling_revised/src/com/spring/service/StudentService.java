package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.persistence.dao.impl.StudentDAOImpl;
import com.spring.to.StudentTO;

public class StudentService {

	@Autowired
	StudentDAOImpl studentDAOImpl;

	public StudentTO getStudentBySid(String sid) {
		return studentDAOImpl.getStudentBySid(sid);
	}

}
