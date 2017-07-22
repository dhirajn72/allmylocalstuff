package com.spring.hibernate.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.stereotype.Repository;

import com.spring.hibernate.dao.CustomerDAO;
import com.spring.to.CustomerTO;

@Repository(value = "CustomerDAOImpl")
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	JpaTemplate jpaTemp;

	public void addCustomer(CustomerTO to) {
		

	}

}
