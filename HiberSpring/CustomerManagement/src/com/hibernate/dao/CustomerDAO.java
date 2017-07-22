package com.hibernate.dao;

import com.hibernate.to.CustomerTO;

public interface CustomerDAO {

	int addCustomer(CustomerTO to);

	void deleteCustomer(int cid) throws Exception;

	void updateCustomer(CustomerTO to);

	CustomerTO searchCustomer(int cid) throws Exception;

}
