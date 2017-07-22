package com.spring.events;

import org.springframework.context.ApplicationListener;

import com.spring.core.WorkShop;

public class WorkShopEventListener implements
		ApplicationListener<WorkShopEvent> {

	@Override
	public void onApplicationEvent(WorkShopEvent workShopEvent) {

		WorkShop workShop = workShopEvent.getWorkShop();
		System.out.println(workShop);

	}

}
