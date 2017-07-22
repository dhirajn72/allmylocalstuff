package com.java.entities.springContainer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

import com.java.entities.HaiHello;

@Configuration
@ImportResource("applicationContext.xml")
public class SpringConfig {

	public SpringConfig() {
		System.out.println("Spring Container-DC");
	}

	@Bean(name = "hello")
	@Scope("prototype")
	public HaiHello getHaiHello() {
		return new HaiHello();
	}

}
