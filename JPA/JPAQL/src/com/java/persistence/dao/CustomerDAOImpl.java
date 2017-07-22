package com.java.persistence.dao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.DefaultEditorKit.CutAction;

import com.java.persistence.Customer;
import com.java.persistence.to.CustomerTO;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public void addCustomer(CustomerTO cust) {
		Customer customer = new Customer(cust.getCname(), cust.getEmail(),
				cust.getPhone(), cust.getCity());
		JPATemplate.add(customer);
	}

	@Override
	public void removeCustomer(int cid) {
		JPATemplate.remove(cid);

	}

	@Override
	public void updateCustomer(CustomerTO customerTO) {
		JPATemplate.update(customerTO);

	}

	@Override
	public CustomerTO getCustomerByCid(int cid) {
		CustomerTO customerTO = null;
		String query = "from Customer c where c.cid=?";
		List<Object> list = (List<Object>) JPATemplate.find(query, cid);
		for (Object ob : list) {
			Customer cust = (Customer) ob;
			customerTO = new CustomerTO(cust.getCid(), cust.getCname(),
					cust.getEmail(), cust.getPhone(), cust.getCity());
		}
		return customerTO;
	}

	@Override
	public List<CustomerTO> getAllCustomers() {
		List<CustomerTO> tos = new ArrayList<CustomerTO>();
		String query = "from Customer cust";

		List<Object> list = JPATemplate.find(query);
		for (Object ob : list) {
			Customer cust = (Customer) ob;
			CustomerTO customerTO = new CustomerTO(cust.getCid(),
					cust.getCname(), cust.getEmail(), cust.getPhone(),
					cust.getCity());
			tos.add(customerTO);
		}
		return tos;
	}

	@Override
	public List<CustomerTO> getCustomersByCity(String city) {
		List<CustomerTO> tos = new ArrayList<CustomerTO>();
		String query = "from Customer cust where cust.city=?";

		List<Object> list = (List<Object>) JPATemplate.find(query, city);
		for (Object ob : list) {
			Customer cust = (Customer) ob;
			CustomerTO customerTO = new CustomerTO(cust.getCid(),
					cust.getCname(), cust.getEmail(), cust.getPhone(),
					cust.getCity());
			tos.add(customerTO);
		}
		return tos;
	}

	@Override
	public List<CustomerTO> getCustomersByCity(String city, int start, int total) {
		List<CustomerTO> tos = new ArrayList<CustomerTO>();
		String query = "from Customer cust where cust.city=?";

		List<Object> list = (List<Object>) JPATemplate.find(query, start,
				total, city);
		for (Object ob : list) {
			Customer cust = (Customer) ob;
			CustomerTO customerTO = new CustomerTO(cust.getCid(),
					cust.getCname(), cust.getEmail(), cust.getPhone(),
					cust.getCity());
			tos.add(customerTO);
		}
		return tos;
	}

	@Override
	public List<CustomerTO> getCustomers(int start, int total) {
		List<CustomerTO> customerTOs = new ArrayList<CustomerTO>();
		String query = "from Customer cust";
		Object objects = JPATemplate.find(query, start, total);
		Customer cust = (Customer) objects;
		customerTOs.add(new CustomerTO(cust.getCid(), cust.getCname(), cust
				.getEmail(), cust.getPhone(), cust.getCity()));

		return customerTOs;
	}

}
