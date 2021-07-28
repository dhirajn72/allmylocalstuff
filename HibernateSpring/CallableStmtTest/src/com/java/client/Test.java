package com.java.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.dao.CustomerDAO;
import com.java.to.CustomerTO;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		CustomerDAO dao = (CustomerDAO) applicationContext
				.getBean("customerDaoImpl");

		CustomerTO to = new CustomerTO(88, "dk", "dk@gmail.com", "12345");

		dao.addCustomer(to);
		System.out.println("Check DB !!");

	}

}
