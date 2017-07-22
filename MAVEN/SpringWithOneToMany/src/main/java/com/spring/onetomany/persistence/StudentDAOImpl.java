package com.spring.onetomany.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.spring.onetomany.Student;
import com.spring.onetomany.StudentDAO;

public class StudentDAOImpl implements StudentDAO {

	@Autowired
	HibernateTemplate template;

	public List<Student> getSubjectsByStudent(String sname) {
		String hql = "from Student where sname=?";
		List<Student> students = (List<Student>) template.find(hql, sname);
		return students;
	}

	public void saveStudent(Student st) {
		template.save(st);

	}

}
