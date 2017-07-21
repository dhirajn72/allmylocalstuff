package com.spring.hibernateTemp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	public void addCustomer(CustomerTO to) {
		Customer customer = new Customer(to.getCname(), to.getEmail(),
				to.getPhone(), to.getCity(), to.getAge());
		hibernateTemplate.save(customer);

	}

	@Override
	public void deleteCustomer(int cid) {
		Customer customer = (Customer) hibernateTemplate.load(Customer.class,
				cid);
		hibernateTemplate.delete(customer);
	}

	@Override
	public void updateCustomer(CustomerTO to) {
		Customer cust = (Customer) hibernateTemplate.load(Customer.class,
				to.getCid());
		cust.setCname(to.getCname());
		cust.setEmail(to.getEmail());
		cust.setPhone(to.getPhone());
		cust.setCity(to.getCity());
		cust.setAge(to.getAge());
		hibernateTemplate.update(cust);

	}

	@Override
	public List<CustomerTO> getAllCustomer() {
		String query = "from Customer cust";
		List<CustomerTO> tos = new ArrayList<CustomerTO>();
		List<Customer> list = (List<Customer>) hibernateTemplate.find(query);
		for (Customer c : list) {
			CustomerTO to = new CustomerTO(c.getCid(), c.getCname(),
					c.getEmail(), c.getPhone(), c.getCity(), c.getAge());
			tos.add(to);
		}

		return tos;
	}

	@Override
	public List getAllCustomerByCity(String city) {
		String query = "from Customer c where c.city=?";
		return hibernateTemplate.find(query, city);

	}

	@Override
	public CustomerTO getCustomerByCid(int cid) {
		Customer cust = hibernateTemplate.load(Customer.class, cid);
		CustomerTO to = new CustomerTO(cust.getCid(), cust.getCname(),
				cust.getEmail(), cust.getPhone(), cust.getCity(), cust.getAge());

		return to;
	}

}
