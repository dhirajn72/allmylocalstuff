package com.spring.rest.ws.to;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customers {
	private List<CustomerTO> customerTOs = new ArrayList<CustomerTO>();

	@XmlElement(name = "customer")
	public List<CustomerTO> getCustomerTOs() {
		return customerTOs;
	}

	public void setCustomerTOs(List<CustomerTO> customerTOs) {
		this.customerTOs = customerTOs;
	}

	public void addCustomer(CustomerTO to) {
		this.customerTOs.add(to);
	}

}
