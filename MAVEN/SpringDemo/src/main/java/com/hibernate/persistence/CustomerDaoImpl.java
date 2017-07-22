package com.hibernate.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.dao.CustomerDAO;
import com.hibernate.to.CustomerTO;

@Transactional
public class CustomerDaoImpl implements CustomerDAO {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
	public int addCustomer(CustomerTO to) {
		Customer customer = new Customer(to.getCname(), to.getEmail(),
				to.getPhone(), to.getAge());
		int id = (Integer) hibernateTemplate.save(customer);
		return id;
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
	public void deleteCustomer(int cid) {
		Customer customer = hibernateTemplate.load(Customer.class, cid);
		hibernateTemplate.delete(customer);

	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
	public CustomerTO searchCustomer(int cid) {
		Customer customer = hibernateTemplate.load(Customer.class, cid);
		CustomerTO to = new CustomerTO(customer.getCid(), customer.getCname(),
				customer.getEmail(), customer.getPhone(), customer.getAge());

		return to;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED)
	public void updateCustomer(CustomerTO to) {
		Customer customer = hibernateTemplate.load(Customer.class, to.getCid());
		customer.setCname(to.getCname());
		customer.setEmail(to.getEmail());
		customer.setPhone(to.getPhone());
		customer.setAge(to.getAge());
		hibernateTemplate.update(customer);

	}
}
