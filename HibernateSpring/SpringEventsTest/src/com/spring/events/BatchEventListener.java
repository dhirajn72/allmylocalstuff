package com.spring.events;

import org.springframework.context.ApplicationListener;

import com.spring.core.Batch;

public class BatchEventListener implements ApplicationListener<BatchEvent> {
	@Override
	public void onApplicationEvent(BatchEvent batchEvent) {

		Batch batch = batchEvent.getBatch();
		System.out.println(batch);

	}

}
