package com.java.jpa.dao;

import com.java.jpa.Customer;
import com.java.jpa.persistence.JPATemplate;
import com.java.jpa.to.CustomerTO;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public void addCustomer(CustomerTO to) {
		Customer customer = new Customer(to.getCname(), to.getEmail(),
				to.getPhone());
		JPATemplate.add(customer);

	}

	@Override
	public void removeCustomer(int cid) {
		JPATemplate.remove(cid);

	}

	@Override
	public void mergeCustomer(CustomerTO to) {
		// TODO Auto-generated method stub
		Customer customer = new Customer(to.getCid(), to.getCname(),
				to.getEmail(), to.getPhone());
		JPATemplate.merge(customer);

	}

	@Override
	public CustomerTO getCustomerByCid(int cid) {
		Customer customer = JPATemplate.load(Customer.class, cid);
		CustomerTO customerTO = new CustomerTO(customer.getCid(),
				customer.getCname(), customer.getEmail(), customer.getPhone());
		return customerTO;
	}

}
