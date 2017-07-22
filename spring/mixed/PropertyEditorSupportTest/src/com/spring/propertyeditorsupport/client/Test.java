package com.spring.propertyeditorsupport.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.propertyeditorsupport.Student;
import com.spring.propertyeditorsupport.StudentID;

public class Test {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		Student student = (Student) applicationContext.getBean("student");
		System.out.println(student);
		System.out.println("*****");
		List<String> emails = student.getEmails();
		for (String email : emails) {
			System.out.println(email);
		}

		System.out.println("******");
		List<String> phones = student.getPhones();
		for (String phone : phones) {
			System.out.println(phone);
		}
		// applicationContext.refresh();
		System.out.println("**********");
		Student student1 = (Student) applicationContext.getBean("student");
		System.out.println(student1);

	}
}
