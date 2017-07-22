package com.spring.postprocessors;

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
		BeanFactoryAware, ApplicationContextAware, MyBeanPostProcessor {

	BeanFactory beanFactory;
	String bname;
	ApplicationContext applicationContext;

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		System.out.println("setApplicationContext()");
		this.applicationContext = applicationContext;
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("setBeanFactory()");
		this.beanFactory = beanFactory;
	}

	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("setBeanName()");
		this.bname = name;
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy()");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet()");
	}

	@PostConstruct
	public void init() {
		System.out.println("init()");
	}

	@PreDestroy
	public void myDestroy() {
		System.out.println("myDestroy()");
	}

	public void initialised() {
		System.out.println("initialised()");
	}

	public void destroyed() {
		System.out.println("destroyed()");
	}

	public void myPostProcessBeforeInit() {
		// TODO Auto-generated method stub
		System.out.println("myPostProcessBeforeInit()");
	}

	public void show() {
		System.out.println("****show()****");
		System.out.println(beanFactory);
		System.out.println(bname);
		System.out.println(applicationContext);
		System.out.println("********");
	}

}
