package com.hibernate.persistence.dao;

import java.util.List;

import com.hibernate.persistence.Customer;

public interface CustomerDAO {
	public void addCustomer(Customer customer);

	public void deleteCustomer(int cid);

	public void updateCustomer(Customer customer);

	public List<Customer> getAllCustomer();

	public List<Customer> getCustomersByCity(String city);

	public Customer getCustomerByEmail(String email);

}
