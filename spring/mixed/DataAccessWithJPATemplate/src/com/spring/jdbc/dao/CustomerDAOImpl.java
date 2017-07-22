package com.spring.jdbc.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	JpaTemplate jpaTemplate;

	@Autowired
	JpaTransactionManager jpaTransactionManager;

	@Override
	public void addCustomer(CustomerTO to) {
		TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
		TransactionStatus transactionStatus = jpaTransactionManager
				.getTransaction(transactionDefinition);

		Customer customer = new Customer(to.getCname(), to.getEmail(),
				to.getPhone(), to.getCity());

		jpaTemplate.persist(customer);
		jpaTransactionManager.commit(transactionStatus);

	}

	@Override
	public void deleteCustomer(int cid) {

		TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
		TransactionStatus transactionStatus = jpaTransactionManager
				.getTransaction(transactionDefinition);

		Customer customer = (Customer) jpaTemplate.getReference(Customer.class,
				cid);
		jpaTemplate.remove(customer);
		jpaTransactionManager.commit(transactionStatus);

	}

	@Override
	public void updateCustomer(CustomerTO to) {
		TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
		TransactionStatus transactionStatus = jpaTransactionManager
				.getTransaction(transactionDefinition);

		Customer customer = (Customer) jpaTemplate.getReference(Customer.class,
				to.getCid());
		customer.setCname(to.getCname());
		customer.setEmail(to.getEmail());
		customer.setPhone(to.getPhone());
		customer.setCity(to.getCity());
		jpaTemplate.merge(customer);
		jpaTransactionManager.commit(transactionStatus);

	}

	@Override
	public List<CustomerTO> getAllCustomers() {

		List<CustomerTO> tos = new ArrayList<CustomerTO>();
		List<Customer> customers = jpaTemplate.find("from Customer cust");
		for (Customer cust : customers) {
			CustomerTO to = new CustomerTO(cust.getCid(), cust.getCname(),
					cust.getEmail(), cust.getPhone(), cust.getCity());
			tos.add(to);
		}
		return tos;
	}

	@Override
	public CustomerTO getCustomerByCid(int cid) {
		Customer customer = (Customer) jpaTemplate.find(
				"from Customer cust where cust.cid=?", cid).get(0);

		return new CustomerTO(customer.getCid(), customer.getCname(),
				customer.getEmail(), customer.getPhone(), customer.getCity());
	}

	@Override
	public List<CustomerTO> getCustomerByCity(String city) {
		List<CustomerTO> tos = new ArrayList<CustomerTO>();

		List<Customer> list = jpaTemplate.find("from Customer where city=?",
				city);
		for (Customer cust : list) {
			CustomerTO to = new CustomerTO(cust.getCid(), cust.getCname(),
					cust.getEmail(), cust.getPhone(), cust.getCity());
			tos.add(to);
		}
		return tos;
	}

	@Override
	public CustomerTO getCustomerByEmail(String email) {
		Customer customer = (Customer) jpaTemplate.find(
				"from Customer where email=?", email).get(0);
		return new CustomerTO(customer.getCid(), customer.getCname(),
				customer.getEmail(), customer.getPhone(), customer.getCity());
	}
}
