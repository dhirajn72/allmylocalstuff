package com.spring.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringKafkaApplication {

	public static void main(String[] args) {
		System.err.println("main starts !");
		SpringApplication.run(SpringKafkaApplication.class, args);
		System.err.println("main ends !");
	}

}