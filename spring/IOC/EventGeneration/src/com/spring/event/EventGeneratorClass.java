package com.spring.event;

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

	public void generateBatchEvent(Batch batch) {
		applicationContext.publishEvent(new BatchEvent(this, batch));
	}

}
