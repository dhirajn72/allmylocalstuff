package com.spring.events;

import org.springframework.context.ApplicationEvent;

import com.spring.core.WorkShop;

public class WorkShopEvent extends ApplicationEvent {
	WorkShop workShop;

	public WorkShopEvent(Object info, WorkShop workShop) {
		super(info);
		this.workShop = workShop;
	}

	public WorkShop getWorkShop() {
		return workShop;
	}

}
