package com.spring.jdbc.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	public void addCustomer(CustomerTO to) {
		Customer customer = new Customer(to.getCname(), to.getEmail(),
				to.getPhone(), to.getCity());

		hibernateTemplate.save(customer);

	}

	@Override
	public void deleteCustomer(int cid) {
		DetachedCriteria detachedCriteria = DetachedCriteria
				.forClass(Customer.class);
		detachedCriteria.add(Restrictions.eq("cid", cid));
		Customer customer = (Customer) hibernateTemplate.findByCriteria(
				detachedCriteria).get(0);
		hibernateTemplate.delete(customer);

	}

	@Override
	public void updateCustomer(CustomerTO to) {
		DetachedCriteria detachedCriteria = DetachedCriteria
				.forClass(Customer.class);
		detachedCriteria.add(Restrictions.eq("cid", to.getCid()));
		Customer customer = (Customer) hibernateTemplate.findByCriteria(
				detachedCriteria).get(0);
		customer.setCname(to.getCname());
		customer.setEmail(to.getEmail());
		customer.setPhone(to.getPhone());
		customer.setCity(to.getCity());
		hibernateTemplate.update(customer);

	}

	@Override
	public List<CustomerTO> getAllCustomers() {

		List<CustomerTO> tos = new ArrayList<CustomerTO>();
		DetachedCriteria detachedCriteria = DetachedCriteria
				.forClass(Customer.class);

		List<Customer> customers = hibernateTemplate
				.findByCriteria(detachedCriteria);
		for (Customer cust : customers) {
			CustomerTO to = new CustomerTO(cust.getCid(), cust.getCname(),
					cust.getEmail(), cust.getPhone(), cust.getCity());
			tos.add(to);
		}
		return tos;
	}

	@Override
	public CustomerTO getCustomerByCid(int cid) {
		DetachedCriteria detachedCriteria = DetachedCriteria
				.forClass(Customer.class);
		detachedCriteria.add(Restrictions.eq("cid", cid));
		Customer customer = (Customer) hibernateTemplate.findByCriteria(
				detachedCriteria).get(0);
		return new CustomerTO(customer.getCid(), customer.getCname(),
				customer.getEmail(), customer.getPhone(), customer.getCity());
	}

	@Override
	public List<CustomerTO> getCustomerByCity(String city) {
		List<CustomerTO> tos = new ArrayList<CustomerTO>();

		DetachedCriteria detachedCriteria = DetachedCriteria
				.forClass(Customer.class);
		detachedCriteria.add(Restrictions.eq("city", city));
		List<Customer> list = hibernateTemplate
				.findByCriteria(detachedCriteria);
		for (Customer cust : list) {
			CustomerTO to = new CustomerTO(cust.getCid(), cust.getCname(),
					cust.getEmail(), cust.getPhone(), cust.getCity());
			tos.add(to);
		}
		return tos;
	}

	@Override
	public CustomerTO getCustomerByEmail(String email) {
		DetachedCriteria detachedCriteria = DetachedCriteria
				.forClass(Customer.class);
		detachedCriteria.add(Restrictions.eq("email", email));
		Customer customer = (Customer) hibernateTemplate.findByCriteria(
				detachedCriteria).get(0);
		return new CustomerTO(customer.getCid(), customer.getCname(),
				customer.getEmail(), customer.getPhone(), customer.getCity());
	}
}
