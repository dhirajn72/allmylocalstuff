package com.java.spring;

import org.springframework.context.ApplicationListener;

public class BatchEventListener implements ApplicationListener<BatchEvent> {

	public void onApplicationEvent(BatchEvent batchEvent) {

		Batch batch = batchEvent.getBatch();
		System.out.println(batch);

	}
}
