package com.spring.hibernateTemp;

import java.util.List;

public interface CustomerDAO {

	void addCustomer(CustomerTO to);

	void deleteCustomer(int cid);

	void updateCustomer(CustomerTO to);

	List<CustomerTO> getAllCustomer();

	List getAllCustomerByCity(String city);

	CustomerTO getCustomerByCid(int cid);

}
