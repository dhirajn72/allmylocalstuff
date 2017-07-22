package com.spring.events;

import org.springframework.context.ApplicationEvent;

import com.spring.core.Batch;

public class BatchEvent extends ApplicationEvent {
	Batch batch;

	public BatchEvent(Object info, Batch batch) {
		super(info);
		this.batch = batch;
	}

	public Batch getBatch() {
		return batch;
	}

}
