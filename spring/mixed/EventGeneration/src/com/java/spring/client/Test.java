package com.java.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.spring.Batch;
import com.java.spring.BatchEvent;
import com.java.spring.EventController;

public class Test {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		EventController eventController = (EventController) applicationContext
				.getBean("eventController");

		Batch batch = new Batch("SPRING-001", "Spring-MVC", "4:30PM-8:30PM");
		eventController.batchEvent(batch);
		

	}

}
