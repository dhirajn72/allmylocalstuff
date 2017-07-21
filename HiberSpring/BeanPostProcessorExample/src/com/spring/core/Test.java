package com.spring.core;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Test implements InitializingBean, DisposableBean, BeanNameAware,
		BeanFactoryAware, ApplicationContextAware {

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		System.out.println("setApplicationContext()" + applicationContext);
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("setBeanFactory()" + arg0);
	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println("setBeanName()" + arg0);

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy()");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
	}

	@PostConstruct
	public void method1() {
		System.out.println("@PostConstruct->method1()");
	}

	@PreDestroy
	public void method2() {
		System.out.println("@PreDestroy->method2()");
	}

	public void method3() {
		System.out.println("init-method: method3()");
	}

	public void method4() {
		System.out.println("destroy-method: method4()");
	}

}
