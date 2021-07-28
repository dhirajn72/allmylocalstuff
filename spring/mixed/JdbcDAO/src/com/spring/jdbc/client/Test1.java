package com.spring.jdbc.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.CustomerDAO;
import com.spring.jdbc.dao.CustomerTO;

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		CustomerDAO customerDAO = (CustomerDAO) applicationContext
				.getBean("customerDAO");

		CustomerTO to = new CustomerTO(102, "Dhiraj", "dhiraj@gmail.com",
				Long.parseLong("12345"), "Aurangabad");
		customerDAO.addCustomer(to);
		CustomerTO to1 = new CustomerTO(103, "kumar", "kumar@gmail.com",
				Long.parseLong("12345"), "Aurangabad");
		customerDAO.addCustomer(to1);
		CustomerTO to2 = new CustomerTO(104, "Alok", "alok@gmail.com",
				Long.parseLong("12345"), "Bhopal");
		customerDAO.addCustomer(to2);
		CustomerTO to3 = new CustomerTO(106, "Ranjan", "ranjan@gmail.com",
				Long.parseLong("12345"), "Munger");
		customerDAO.addCustomer(to3);
		CustomerTO to4 = new CustomerTO(107, "Lohar", "lohar@gmail.com",
				Long.parseLong("12345"), "UP");
		customerDAO.addCustomer(to4);
		CustomerTO to5 = new CustomerTO(108, "Bijan", "bijan@gmail.com",
				Long.parseLong("12345"), "Bokaro");
		customerDAO.addCustomer(to5);
		CustomerTO to6 = new CustomerTO(109, "Chhotu", "chhotu@gmail.com",
				Long.parseLong("12345"), "Bokaro");
		customerDAO.addCustomer(to6);
		CustomerTO to7 = new CustomerTO(110, "Raj", "raj@gmail.com",
				Long.parseLong("12345"), "Bokaro");
		customerDAO.addCustomer(to7);
		CustomerTO to8 = new CustomerTO(113, "Rajana", "rajana@gmail.com",
				Long.parseLong("12345"), "Bokaro");
		customerDAO.addCustomer(to8);
		CustomerTO to9 = new CustomerTO(114, "Himanshu", "Himanshu@gmail.com",
				Long.parseLong("12345"), "Rangarh");
		customerDAO.addCustomer(to9);

	}

}
