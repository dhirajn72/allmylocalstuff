package com.spring.event;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		EventGeneratorClass generatorClass = (EventGeneratorClass) applicationContext
				.getBean("generatorClass");

		Batch batch = new Batch("SPRING-001", "Spring-MVC", 500, new Date(2015,
				9, 26));
		System.out.println("New Batch has been started, roll in: ");
		generatorClass.generateBatchEvent(batch);

	}

}
