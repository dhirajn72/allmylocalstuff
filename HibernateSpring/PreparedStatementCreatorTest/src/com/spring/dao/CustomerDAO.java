package com.spring.dao;

import java.util.List;

import com.spring.to.Customer;

public interface CustomerDAO {

	int addCustomer(Customer customer);

	void deleteCustomer(int cid);

	void updateCustomer(Customer customer);

	Customer getCustomer(int cid);

	List<Customer> getAllCustomers();

	Customer getCustomerByEmail(String email);

	List<Customer> getCustomersByCity(String city);

}
