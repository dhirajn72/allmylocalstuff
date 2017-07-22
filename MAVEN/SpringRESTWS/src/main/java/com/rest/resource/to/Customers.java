package com.rest.resource.to;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CUSTOMERS")
public class Customers {

	private List<CustomerTO> tos = new ArrayList<CustomerTO>();

	@XmlElement(name = "customer")
	public List<CustomerTO> getTos() {
		return tos;
	}

	public void setTos(List<CustomerTO> tos) {
		this.tos = tos;
	}

	public void addCustomer(CustomerTO to) {
		this.tos.add(to);

	}

}
