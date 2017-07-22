package com.hibernate.bussinessLayer;

import java.util.List;

import com.spring.to.CustomerTO;

public interface CustomerDAO {

	int addCustomer(CustomerTO to);

	int updateCustomer(CustomerTO to);

	void deleteCustomer(CustomerTO to);

	CustomerTO getCustomerByCid(int cid);

	List<CustomerTO> getAllCustomer();

	List<CustomerTO> getCustomerByCity(String city);

	List<CustomerTO> getCustomerByCompany(String company);

	CustomerTO getCustomerByEmail(String email);

	CustomerTO getCustomerByPhone(String phone);

}
