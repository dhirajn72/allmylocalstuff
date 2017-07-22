package com.spring.jdbc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class CustomerDAOImpl extends HibernateDaoSupport implements CustomerDAO {

	@Override
	public void addCustomer(CustomerTO to) {
		Customer customer = new Customer(to.getCname(), to.getEmail(),
				to.getPhone(), to.getCity());

		getHibernateTemplate().save(customer);

	}

	@Override
	public void deleteCustomer(int cid) {
		Customer customer = getHibernateTemplate().load(Customer.class, cid);
		getHibernateTemplate().delete(customer);

	}

	@Override
	public void updateCustomer(CustomerTO to) {
		Customer customer = getHibernateTemplate().load(Customer.class,
				to.getCid());
		customer.setCname(to.getCname());
		customer.setEmail(to.getEmail());
		customer.setPhone(to.getPhone());
		customer.setCity(to.getCity());
		getHibernateTemplate().update(customer);

	}

	@Override
	public List<CustomerTO> getAllCustomers() {

		List<CustomerTO> tos = new ArrayList<CustomerTO>();
		String hql = "from Customer";
		List<Customer> customers = getHibernateTemplate().find(hql);
		for (Customer cust : customers) {
			CustomerTO to = new CustomerTO(cust.getCid(), cust.getCname(),
					cust.getEmail(), cust.getPhone(), cust.getCity());
			tos.add(to);
		}

		return tos;
	}

	@Override
	public CustomerTO getCustomerByCid(int cid) {
		String query = "from Customer where cid=?";
		Customer customer = (Customer) getHibernateTemplate().find(query, cid)
				.get(0);
		return new CustomerTO(customer.getCid(), customer.getCname(),
				customer.getEmail(), customer.getPhone(), customer.getCity());

	}

	@Override
	public List<CustomerTO> getCustomerByCity(String city) {
		List<CustomerTO> tos = new ArrayList<CustomerTO>();
		String query = "from Customer where city=?";
		List<Customer> list = getHibernateTemplate().find(query, city);
		for (Customer cust : list) {
			CustomerTO to = new CustomerTO(cust.getCid(), cust.getCname(),
					cust.getEmail(), cust.getPhone(), cust.getCity());
			tos.add(to);
		}
		return tos;
	}

	@Override
	public CustomerTO getCustomerByEmail(String email) {
		String query = "from Customer where email=?";
		Customer customer = (Customer) getHibernateTemplate()
				.find(query, email).get(0);
		return new CustomerTO(customer.getCid(), customer.getCname(),
				customer.getEmail(), customer.getPhone(), customer.getCity());

	}

}
