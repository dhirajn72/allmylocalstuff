package com.java.events.listener;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.java.events.Batch;
import com.java.events.BatchEvent;

public class MainEventListener implements ApplicationContextAware {
	ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
	}

	public void batchEvent(Batch batch) {
		applicationContext.publishEvent(new BatchEvent(this, batch));
	}

}
