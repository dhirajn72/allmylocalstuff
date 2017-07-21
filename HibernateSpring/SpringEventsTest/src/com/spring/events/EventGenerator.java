package com.spring.events;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.spring.core.Batch;
import com.spring.core.WorkShop;

public class EventGenerator implements ApplicationContextAware {
	ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
	}

	public void batchEvent(Batch batch) {
		applicationContext.publishEvent(new BatchEvent(this, batch));
	}

	public void workShopEvent(WorkShop workShop) {
		applicationContext.publishEvent(new WorkShopEvent(this, workShop));
	}

}
