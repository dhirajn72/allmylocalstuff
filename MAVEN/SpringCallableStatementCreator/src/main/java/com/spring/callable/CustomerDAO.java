package com.spring.callable;

import org.springframework.stereotype.Repository;

import com.spring.callable.to.CustomerTO;


public interface CustomerDAO {
	void addCustomer(CustomerTO to);

}
