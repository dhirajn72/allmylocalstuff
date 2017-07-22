package com.java.core.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.core.Student;

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		Student student = (Student) applicationContext.getBean("student");
		System.out.println(student);
		System.out.println("*******");
		List<String> phones = student.getPhones();
		for (String phone : phones) {
			System.out.println(phone);
		}
		System.out.println("*********");
		List<String> list = student.getEmails();
		for (String email : list) {
			System.out.println(email);
		}

	}

}
