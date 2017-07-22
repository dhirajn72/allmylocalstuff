package com.spring.controller;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

@WebListener
public class Log4jUtil implements ServletContextListener {

	Logger logger = Logger.getLogger(MainController.class);

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Log4j is initialized at container startup");

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("ontextInitialized(ServletContextEvent)");
	}

}
