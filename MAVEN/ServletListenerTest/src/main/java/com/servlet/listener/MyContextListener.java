package com.servlet.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyContextListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent sce) {

		System.out.println("MyContextListener-contextInitialized() called");
		System.out.println("Source:" + sce.getSource());
		System.out.println("Class:" + sce.getClass());

	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("MyContextListener-contextDestroyed() called");
		System.out.println("Source:" + sce.getSource());
		System.out.println("Class:" + sce.getClass());

	}

}
