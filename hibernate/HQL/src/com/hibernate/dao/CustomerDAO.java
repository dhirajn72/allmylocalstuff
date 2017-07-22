package com.hibernate.dao;

import java.util.List;

import com.hibernate.to.CustomerTO;

public interface CustomerDAO {

	void addCustomer(CustomerTO to);

	void deleteCustomerByCid(int cid);

	void updateCustomer(CustomerTO to);

	List<CustomerTO> getAllCustomers();

	List<CustomerTO> getAllCustomersByCompany(String cname);

	CustomerTO getCustomerByCid(int to);

}
