package com.spring.java.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.java.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		Student student = (Student) applicationContext.getBean("student");

		System.out.println(student);
		List<String> emails = student.getEmails();

		for (String email : emails) {
			System.out.println(email);
		}

	}

}
