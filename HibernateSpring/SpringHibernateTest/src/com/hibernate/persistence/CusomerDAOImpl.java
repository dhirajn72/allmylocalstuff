package com.hibernate.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.hibernate.bussinessLayer.CustomerDAO;
import com.spring.to.CustomerTO;

public class CusomerDAOImpl implements CustomerDAO {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	public int addCustomer(CustomerTO to) {
		Customer customer = new Customer(to.getCname(), to.getEmail(),
				to.getPhone(), to.getAge(), to.getCompany(), to.getCity());
		Integer id = (Integer) hibernateTemplate.save(customer);
		return id.intValue();

	}

	@Override
	public int updateCustomer(CustomerTO to) {

		return 0;

	}

	@Override
	public void deleteCustomer(CustomerTO to) {
		// TODO Auto-generated method stub

	}

	@Override
	public CustomerTO getCustomerByCid(int cid) {

		Customer cust = (Customer) hibernateTemplate.load(Customer.class, cid);

		return new CustomerTO(cust.getCid(), cust.getCname(), cust.getEmail(),
				cust.getPhone(), cust.getAge(), cust.getCompany(),
				cust.getCity());
	}

	@Override
	public List<CustomerTO> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerTO> getCustomerByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerTO> getCustomerByCompany(String company) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerTO getCustomerByEmail(String email) {
		String query = "from Customer cust where cust.email=?";
		Customer cust = (Customer) hibernateTemplate.find(query, email).get(0);
		System.out.println(cust);
		return new CustomerTO(cust.getCid(), cust.getCname(), cust.getEmail(),
				cust.getPhone(), cust.getAge(), cust.getCompany(),
				cust.getCity());
	}

	@Override
	public CustomerTO getCustomerByPhone(String phone) {
		// TODO Auto-generated method stub
		return null;
	}

}
