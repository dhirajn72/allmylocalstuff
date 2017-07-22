package com.java.test.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.test.CustomerDAO;
import com.java.test.CustomerTO;

public class Test {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		CustomerDAO dao = (CustomerDAO) applicationContext
				.getBean("customerDaoImpl");

		CustomerTO to = new CustomerTO(66, "Rajjo", "rajj@gmail.com",
				"9743853399");
		dao.addCustomer(to);
		System.out.println("Check DB !!");

	}

}
