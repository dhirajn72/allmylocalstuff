package com.spring.core;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customers {

	private List<Customer> customers;

	public Customers() {
		customers = new ArrayList<Customer>();
	}

	@XmlElement(name = "customer")
	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public void addCustomer(Customer customer) {
		this.customers.add(customer);

	}

}
