package com.java.jdbc.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.jdbc.CustomerTO;
import com.java.jdbc.dao.CustomerDAO;
import com.java.jdbc.id.IDGenerator;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		CustomerDAO customerDAO = (CustomerDAO) applicationContext
				.getBean("customerDao");

		CustomerTO customerTO1 = new CustomerTO(IDGenerator.getNextId(),
				"dhiraj", "dhiraj@gmail.com", "974378544", "22/09/1990");
		customerDAO.addCustomer(customerTO1);

		CustomerTO customerTO2 = new CustomerTO(IDGenerator.getNextId(),
				"singh", "singh@gmail.com", "99999999", "22/09/1990");
		customerDAO.addCustomer(customerTO2);
		CustomerTO customerTO3 = new CustomerTO(IDGenerator.getNextId(),
				"kumar", "kumar@gmail.com", "974378544", "22/09/1990");
		customerDAO.addCustomer(customerTO3);

		CustomerTO customerTO4 = new CustomerTO(IDGenerator.getNextId(),
				"manish", "manish@gmail.com", "974378544", "22/09/1990");
		customerDAO.addCustomer(customerTO4);
		CustomerTO customerTO5 = new CustomerTO(IDGenerator.getNextId(), "sri",
				"sri@gmail.com", "974378544", "22/09/1990");
		customerDAO.addCustomer(customerTO5);

		CustomerTO customerTO6 = new CustomerTO(IDGenerator.getNextId(),
				"nivas", "nivas@gmail.com", "974378544", "22/09/1990");
		customerDAO.addCustomer(customerTO6);

		CustomerTO customerTO7 = new CustomerTO(IDGenerator.getNextId(),
				"dande", "dande@gmail.com", "974378544", "22/09/1990");
		customerDAO.addCustomer(customerTO7);

	}
}
