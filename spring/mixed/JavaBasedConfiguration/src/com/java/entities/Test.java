package com.java.entities;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.entities.springContainer.SpringConfig;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
				SpringConfig.class);

		System.out.println("**********");
		Hello hello = (Hello) annotationConfigApplicationContext
				.getBean(Hello.class);
		hello.show();
		Hello hello2 = (Hello) annotationConfigApplicationContext
				.getBean(Hello.class);
		hello2.show();

		System.out.println("**********");
		System.out.println("comparing hello and hello2:" + (hello == hello2));
		System.out.println("*************");
		Hai hai = (Hai) annotationConfigApplicationContext.getBean(Hai.class);
		hai.show();
		System.out.println("*************");
		Hai hai2 = (Hai) annotationConfigApplicationContext.getBean(Hai.class);
		hai2.show();
		System.out.println("*************");
		System.out.println("comparing hai and hai2:" + (hai == hai2));

	}
}
