package com.java.rest.easy;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customers {
	private List<Customer> customers = new ArrayList<Customer>();

	public Customers() {
		// TODO Auto-generated constructor stub
	}

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
