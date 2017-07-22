package com.spring.events.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.events.Batch;
import com.spring.events.EventGenerator;

public class Test {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		EventGenerator eventGenerator = (EventGenerator) applicationContext
				.getBean("eventGenerator");
		Batch batch = new Batch("B-101", "Hibernate", "500", "25/03/2015");
		eventGenerator.generateBatchEvent(batch);

	}
}
