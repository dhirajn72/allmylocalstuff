package com.spring.dao;

import java.util.*;

public interface CustomerDAO {

	void addCustomer(CustomerTO to);

	void deleteCustomer(int cid);

	void updateCustomer(CustomerTO to);

	List<CustomerTO> getAllCustomer();

	List<CustomerTO> getAllCustomerByCity(String city);

}
