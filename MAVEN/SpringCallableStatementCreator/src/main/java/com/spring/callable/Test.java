package com.spring.callable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.callable.to.CustomerTO;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		CustomerTO to = new CustomerTO(99, "Singh", "singh@gmail.com",
				"9743854499");
		CustomerDAOImpl daoImpl = (CustomerDAOImpl) applicationContext
				.getBean("customerDAOImpl");
		daoImpl.addCustomer(to);

	}
}
