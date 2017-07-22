package com.hibernate.persistence.dao;

import com.spring.rest.ws.to.CustomerTO;
import com.spring.rest.ws.to.Customers;

public interface CustomerDAO {

	Customers getAllCustomers();

	CustomerTO getCustomerById(int id);

}
