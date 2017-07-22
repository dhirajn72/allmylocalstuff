package com.spring.events;

import org.springframework.context.ApplicationEvent;

public class BatchEvent extends ApplicationEvent {
	Batch batch;

	public BatchEvent(Object object, Batch batch) {
		super(object);
		this.batch = batch;
	}

	public Batch getBatch() {
		return batch;
	}

}
