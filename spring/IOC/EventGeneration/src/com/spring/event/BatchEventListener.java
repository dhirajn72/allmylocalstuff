package com.spring.event;

import org.springframework.context.ApplicationListener;

public class BatchEventListener implements ApplicationListener<BatchEvent> {
	@Override
	public void onApplicationEvent(BatchEvent batchEvent) {
		Batch batch = batchEvent.getBatch();
		System.out.println(batch);
	}
}
