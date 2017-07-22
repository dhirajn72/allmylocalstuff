package com.java.jdbc.dao;

import java.util.List;

import com.java.jdbc.CustomerTO;

public interface CustomerDAO {

	void addCustomer(CustomerTO customerTO);

	void deleteCustomer(String cid);

	void updateCustomer(CustomerTO customerTO);

	CustomerTO getCustomerByCid(String cid);

	List<CustomerTO> getAllCustomers();

	CustomerTO getCustomerByEmail(String city);

}
