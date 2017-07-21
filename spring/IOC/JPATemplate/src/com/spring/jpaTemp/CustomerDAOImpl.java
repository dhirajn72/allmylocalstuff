package com.spring.jpaTemp;

import java.util.ArrayList;
import java.util.List;

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
	JpaTransactionManager jpaTransactionManager = null;

	@Override
	public void addCustomer(CustomerTO to) {
		TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
		TransactionStatus transactionStatus = jpaTransactionManager
				.getTransaction(transactionDefinition);

		Customer customer = new Customer(to.getCname(), to.getEmail(),
				to.getPhone(), to.getCity(), to.getAge());
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

		Customer cust = (Customer) jpaTemplate.getReference(Customer.class,
				to.getCid());
		cust.setCname(to.getCname());
		cust.setEmail(to.getEmail());
		cust.setPhone(to.getPhone());
		cust.setCity(to.getCity());
		cust.setAge(to.getAge());
		jpaTemplate.merge(cust);
		jpaTransactionManager.commit(transactionStatus);
	}

	@Override
	public List<CustomerTO> getAllCustomer() {
	/*	TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
		TransactionStatus transactionStatus = jpaTransactionManager
				.getTransaction(transactionDefinition);*/
		List<CustomerTO> list = new ArrayList<CustomerTO>();
		String query = "from Customer c";
		List<Customer> cust1 = jpaTemplate.find(query);
		for (Customer cust2 : cust1) {
			CustomerTO to = new CustomerTO(cust2.getCid(), cust2.getCname(),
					cust2.getEmail(), cust2.getPhone(), cust2.getCity(),
					cust2.getAge());
			list.add(to);
		}
		//jpaTransactionManager.commit(transactionStatus);
		return list;
	}

	@Override
	public List getAllCustomerByCity(String city) {

/*		TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
		TransactionStatus transactionStatus = jpaTransactionManager
				.getTransaction(transactionDefinition);*/
		List list = new ArrayList();
		String query = "from Customer c where c.city=?";
		List<Customer> cust1 = jpaTemplate.find(query, city);
		for (Customer cust2 : cust1) {
			CustomerTO to = new CustomerTO(cust2.getCid(), cust2.getCname(),
					cust2.getEmail(), cust2.getPhone(), cust2.getCity(),
					cust2.getAge());
			list.add(to);
		}
		//jpaTransactionManager.commit(transactionStatus);

		return list;
	}

	@Override
	public CustomerTO getCustomerByCid(int cid) {

	/*	TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
		TransactionStatus transactionStatus = jpaTransactionManager
				.getTransaction(transactionDefinition);*/
		Customer cust = (Customer) jpaTemplate
				.getReference(Customer.class, cid);

		CustomerTO customerTO = new CustomerTO(cust.getCid(), cust.getCname(),
				cust.getEmail(), cust.getPhone(), cust.getCity(), cust.getAge());

		//jpaTransactionManager.commit(transactionStatus);

		return customerTO;

	}

}
