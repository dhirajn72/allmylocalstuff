package com.java.events.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.events.Batch;
import com.java.events.listener.MainEventListener;

public class Test {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		MainEventListener mainEventListener = (MainEventListener) applicationContext
				.getBean("mainEventListener");

		Batch batch = new Batch("SPRING-001", "Spring", "4:00PM-8:00PM", 500,
				7000);
		mainEventListener.batchEvent(batch);

	}
}
