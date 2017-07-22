package com.hibernate.dao;

import java.util.List;

import com.hibernate.to.CustomerTO;

public interface CustomerDAO {
	void addCustomer(CustomerTO to);

	void updateCustomer(CustomerTO to);

	void deleteCustomer(int cid);

	CustomerTO getCustomerById(int cid);

	List<CustomerTO> getAllCustomers();

	List<CustomerTO> getCustomerByCity(String city, int start, int end);

	List<CustomerTO> getCustomerByCtype(String cType);

	List<CustomerTO> getCustomerByAge(int age);

	double getHighestSalary(int limit,int offset);

}
