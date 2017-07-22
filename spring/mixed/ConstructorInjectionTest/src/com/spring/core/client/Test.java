/**
 * 
 */
package com.spring.core.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.Hello;

/**
 * @author Dhiraj Kumar
 * @website www.facebook.com/dhiraj.singh.90
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Hello hello = (Hello) applicationContext.getBean("hello");
		System.out.println(hello);

	}

}
