package com.spring.jdbc.dao;

import java.util.List;

public interface CustomerDAO {

	void addCustomer(CustomerTO to);

	void deleteCustomer(int cid);

	void updateCustomer(CustomerTO to);

	List<CustomerTO> getAllCustomers();

	CustomerTO getCustomerByCid(int cid);

	List<CustomerTO> getCustomerByCity(String city);

	CustomerTO getCustomerByEmail(String email);

}
