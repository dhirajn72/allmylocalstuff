package com.java.persistence.dao;

import java.util.List;

import com.java.persistence.Customer;
import com.java.persistence.to.CustomerTO;

public interface CustomerDAO {

	void addCustomer(CustomerTO customer);

	void removeCustomer(int cid);

	void updateCustomer(CustomerTO customerTO);

	CustomerTO getCustomerByCid(int cid);

	List<CustomerTO> getAllCustomers();

	List<CustomerTO> getCustomersByCity(String city);

	List<CustomerTO> getCustomersByCity(String city, int start, int total);

	List<CustomerTO> getCustomers(int start, int total);

}
