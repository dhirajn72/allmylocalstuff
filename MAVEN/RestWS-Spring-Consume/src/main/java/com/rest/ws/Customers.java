package com.rest.ws;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customers {
	private List<Customer> list = new ArrayList<Customer>();

	@XmlElement(name = "customer")
	public List<Customer> getList() {
		return list;
	}

	public void setList(List<Customer> list) {
		this.list = list;
	}

	public void addCustomer(Customer c) {
		this.list.add(c);

	}

}
