package com.hibernate.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.hibernate.dao.CustomerDAO;
import com.hibernate.to.CustomerTO;

@Transactional
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Autowired
	HibernateTransactionManager hibernateTransactionManager;

	@Override
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
	public int addCustomer(CustomerTO to) {
		// TransactionStatus transactionStatus = null;
		int x = 0;
		try {
			/*
			 * TransactionDefinition transactionDefinition = new
			 * DefaultTransactionDefinition(); transactionStatus =
			 * hibernateTransactionManager
			 * .getTransaction(transactionDefinition);
			 */
			Customer customer = new Customer(to.getCname(), to.getEmail(),
					to.getPhone(), to.getAge());
			x = (Integer) hibernateTemplate.save(customer);
			// hibernateTransactionManager.commit(transactionStatus);
			return x;
		} catch (Exception e) {
			// hibernateTransactionManager.rollback(transactionStatus);
			return x;
		}

	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
	public void deleteCustomer(int cid) {
		Customer customer = hibernateTemplate.get(Customer.class, cid);
		hibernateTemplate.delete(customer);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
	public void updateCustomer(CustomerTO to) {
		Customer customer = hibernateTemplate.get(Customer.class, to.getCid());
		customer.setCname(to.getCname());
		customer.setEmail(to.getEmail());
		customer.setPhone(to.getPhone());
		customer.setAge(to.getAge());
		hibernateTemplate.update(customer);
	}

	@Override
	public void searchCustomer(int cid) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
	public CustomerTO getCustomer(int cid) {
		Customer cust = hibernateTemplate.get(Customer.class, cid);
		return new CustomerTO(cust.getCid(), cust.getCname(), cust.getEmail(),
				cust.getPhone(), cust.getAge());
	}

}
