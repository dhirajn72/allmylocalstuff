package com.spring.persistence.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.spring.persistence.Student;
import com.spring.persistence.dao.StudentDAO;
import com.spring.to.StudentTO;

public class StudentDAOImpl implements StudentDAO {
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	public StudentTO getStudentBySid(String sid) {
		Student stu = hibernateTemplate.load(Student.class, sid);
		StudentTO to = new StudentTO(stu.getCid(), stu.getCname(),
				stu.getEmail(), stu.getPhone(), stu.getCity(), stu.getAge());
		return to;
	}

}
