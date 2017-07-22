package com.spring.events;

import org.springframework.context.ApplicationListener;

public class BatchEventListener implements ApplicationListener<BatchEvent> {
	@Override
	public void onApplicationEvent(BatchEvent batchEvent) {
		// TODO Auto-generated method stub
		System.out.println("Event has been generated");
		Batch batch = batchEvent.getBatch();
		System.out.println(batch);
	}

}
