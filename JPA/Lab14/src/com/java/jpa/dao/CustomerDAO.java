package com.java.jpa.dao;

import com.java.jpa.to.CustomerTO;

public interface CustomerDAO {

	void addCustomer(CustomerTO to);

	void removeCustomer(int cid);

	void mergeCustomer(CustomerTO to);

	CustomerTO getCustomerByCid(int cid);

}
