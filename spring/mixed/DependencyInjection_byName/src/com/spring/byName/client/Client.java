package com.spring.byName.client;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.byName.Test;

public class Client {
	final static Logger logger = Logger.getLogger(Client.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		logger.info("Spring container Intialized");
		Test test = (Test) applicationContext.getBean("test");
		test.show();
		logger.debug("Messages:");

	}

}
