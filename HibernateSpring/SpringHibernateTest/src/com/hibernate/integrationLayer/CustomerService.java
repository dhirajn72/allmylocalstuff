package com.hibernate.integrationLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hibernate.bussinessLayer.CustomerDAO;
import com.spring.to.CustomerTO;

public class CustomerService {

	@Autowired
	CustomerDAO dao;

	public int addCustomer(CustomerTO to) {
		return dao.addCustomer(to);
	}

	public void updateCustomer(CustomerTO to) {
		dao.updateCustomer(to);

	}

	public void deleteCustomer(CustomerTO to) {
		// TODO Auto-generated method stub

	}

	public CustomerTO getCustomerByCid(int cid) {
		return dao.getCustomerByCid(cid);

	}

	public List<CustomerTO> getAllCustomer() {
		return null;
	}

	public List<CustomerTO> getCustomerByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<CustomerTO> getCustomerByCompany(String company) {
		// TODO Auto-generated method stub
		return null;
	}

	public CustomerTO getCustomerByEmail(String email) {
		return dao.getCustomerByEmail(email);

	}

	public CustomerTO getCustomerByPhone(String phone) {
		// TODO Auto-generated method stub
		return null;
	}

}
