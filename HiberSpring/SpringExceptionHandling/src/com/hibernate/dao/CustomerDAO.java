package com.hibernate.dao;

import com.hibernate.to.CustomerTO;

public interface CustomerDAO {

	int addCustomer(CustomerTO to);

	void deleteCustomer(int cid);

	void updateCustomer(CustomerTO to);

	void searchCustomer(int cid);

	CustomerTO getCustomer(int cid);

}
