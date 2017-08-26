package com.spring.kafka;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@SpringBootApplication
public class SpringKafkaApplication implements ApplicationContextAware {

	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		System.err.println("main starts !");
		SpringApplication.run(SpringKafkaApplication.class, args);
		Sender sender = applicationContext.getBean(Sender.class);
		for (String message : args) {
			// sender.send("my-replicated-topic", "producer sending from spring boot, this
			// is third message !");
			sender.send("my-replicated-topic", message);
		}
		System.err.println("main ends !" + applicationContext);
	}

	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		this.applicationContext = arg0;

	}
}