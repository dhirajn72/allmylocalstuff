package com.spring.onetomany.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.onetomany.App;
import com.spring.onetomany.Student;
import com.spring.onetomany.StudentDAO;
import com.spring.onetomany.Subject;

public class Test1 {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		StudentDAO dao = (StudentDAO) context.getBean("studentDAOImpl");

		Subject s1 = new Subject("Physics");
		Subject s2 = new Subject("CS");
		Subject s3 = new Subject("Java");
		Subject s4 = new Subject("Spring");

		List<Subject> list = new ArrayList<Subject>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		Student student = new Student("danial", list);
		dao.saveStudent(student);

	}

}
