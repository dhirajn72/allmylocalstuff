package com.spring.events;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class EventGeneratorClass implements ApplicationContextAware {

	ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
	}

	public void Event(NewCustomer newCustomer) {
		applicationContext.publishEvent(new NewCustomerAddedEvent(this,
				newCustomer));
	}

}
