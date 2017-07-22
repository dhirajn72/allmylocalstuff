package com.spring.events;

import org.springframework.context.ApplicationListener;

public class NewCustomerEventListener implements
		ApplicationListener<NewCustomerAddedEvent> {

	@Override
	public void onApplicationEvent(NewCustomerAddedEvent newCustomerAddedEvent) {

		NewCustomer newCustomer = newCustomerAddedEvent.getNewCustomer();
		System.out.println(newCustomer);

	}

}
