package com.spring.core.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.Batch;
import com.spring.core.WorkShop;
import com.spring.events.EventGenerator;

public class Test {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Batch batch = new Batch(99, "SPRING", "12/04/2015", 200, 5000.00);
		EventGenerator eventGenerator = (EventGenerator) applicationContext
				.getBean("eventGenerator");
		eventGenerator.batchEvent(batch);
		System.out.println("****************");
		WorkShop workShop = new WorkShop("HADOOP", 500, "15/04/2015", 1000);
		eventGenerator.workShopEvent(workShop);

	}
}
