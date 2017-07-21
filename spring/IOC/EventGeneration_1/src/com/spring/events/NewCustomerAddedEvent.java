package com.spring.events;

import org.springframework.context.ApplicationEvent;

public class NewCustomerAddedEvent extends ApplicationEvent {

	NewCustomer newCustomer;

	public NewCustomerAddedEvent(Object source, NewCustomer newCustomer) {
		super(source);
		this.newCustomer = newCustomer;

	}

	public NewCustomer getNewCustomer() {
		return newCustomer;
	}

}
