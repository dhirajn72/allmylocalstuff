package com.hibernate.persistence.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.hibernate.persistence.Customer;
import com.hibernate.persistence.dao.CustomerDAO;
import com.spring.rest.ws.to.CustomerTO;
import com.spring.rest.ws.to.Customers;

/*
 @Repository("custDAOImpl")*/
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	HibernateTemplate hibernateTemplate;

	public Customers getAllCustomers() {

		String hql = "from Customer cust";
		List<Customer> list = (List<Customer>) hibernateTemplate.find(hql);
		Customers customers = new Customers();
		for (Customer c : list) {
			customers.addCustomer(new CustomerTO(c.getCid(), c.getCname(), c
					.getEmail(), c.getPhone(), c.getAge()));
		}
		return customers;
	}

	public CustomerTO getCustomerById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
