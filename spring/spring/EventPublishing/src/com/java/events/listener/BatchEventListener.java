package com.java.events.listener;

import org.springframework.context.ApplicationListener;

import com.java.events.Batch;
import com.java.events.BatchEvent;

public class BatchEventListener implements ApplicationListener<BatchEvent> {

	@Override
	public void onApplicationEvent(BatchEvent batchEvent) {
		Batch batch = batchEvent.getBatch();
		System.out.println(batch);
	}
}
