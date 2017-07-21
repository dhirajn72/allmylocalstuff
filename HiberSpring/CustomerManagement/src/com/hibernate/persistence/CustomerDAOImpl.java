package com.hibernate.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.hibernate.dao.CustomerDAO;
import com.hibernate.to.CustomerTO;

public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Autowired
	HibernateTransactionManager hibernateTransactionManager;

	@Override
	public int addCustomer(CustomerTO to) {
		TransactionStatus transactionStatus = null;
		try {
			TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
			transactionStatus = hibernateTransactionManager
					.getTransaction(transactionDefinition);
			Customer customer = new Customer(to.getCname(), to.getEmail(),
					to.getPhone(), to.getAge());
			int x = (Integer) hibernateTemplate.save(customer);

			hibernateTransactionManager.commit(transactionStatus);
			return x;
		} catch (Exception e) {
			hibernateTransactionManager.rollback(transactionStatus);
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public void deleteCustomer(int cid) throws Exception {
		TransactionStatus transactionStatus = null;
		try {
			TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
			transactionStatus = hibernateTransactionManager
					.getTransaction(transactionDefinition);
			Customer customer = hibernateTemplate.load(Customer.class, cid);
			hibernateTemplate.delete(customer);
			hibernateTransactionManager.commit(transactionStatus);

		} catch (Exception e) {
			hibernateTransactionManager.rollback(transactionStatus);
			throw e;

		}
	}

	@Override
	public CustomerTO searchCustomer(int cid) throws Exception {
		TransactionStatus transactionStatus = null;
		CustomerTO to = new CustomerTO();
		try {
			TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
			transactionStatus = hibernateTransactionManager
					.getTransaction(transactionDefinition);
			Customer customer = hibernateTemplate.load(Customer.class, cid);
			to.setCid(customer.getCid());
			to.setCname(customer.getCname());
			to.setEmail(customer.getEmail());
			to.setPhone(customer.getPhone());
			to.setAge(customer.getAge());
			System.out.println(to);
			hibernateTransactionManager.commit(transactionStatus);
		} catch (Exception e) {
			hibernateTransactionManager.rollback(transactionStatus);
			throw e;
		}
		System.out.println(to);
		return to;
	}

	@Override
	public void updateCustomer(CustomerTO to) {
		TransactionStatus transactionStatus = null;
		try {
			TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
			transactionStatus = hibernateTransactionManager
					.getTransaction(transactionDefinition);
			Customer customer = hibernateTemplate.load(Customer.class,
					to.getCid());
			customer.setCname(to.getCname());
			customer.setEmail(to.getEmail());
			customer.setPhone(to.getPhone());
			customer.setAge(to.getAge());
			hibernateTemplate.update(customer);
			hibernateTransactionManager.commit(transactionStatus);
		} catch (Exception e) {
			hibernateTransactionManager.rollback(transactionStatus);
		}

	}

}
