package com.hibernate.dao;

import java.util.List;

import com.hibernate.persistence.Customer;
import com.hibernate.persistence.CustomerTo;

public interface CustomerDAO {

	void addCustomer(CustomerTo to);

	void deleteCustomer(int cid);

	void updateCustomer(CustomerTo to);

	List<CustomerTo> getAllCustomer();

	List<CustomerTo> getCustomerByCity(String city);

	CustomerTo getCustomerEmail(String email);

	void deleteCustomerByEmail(String email);

}
