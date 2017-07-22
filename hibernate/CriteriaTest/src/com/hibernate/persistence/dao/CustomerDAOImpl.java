package com.hibernate.persistence.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;

import com.hibernate.persistence.Customer;
import com.hibernate.util.HibernateUtil;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public void addCustomer(Customer customer) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.save(customer);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}
	}

	@Override
	public void deleteCustomer(int cid) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			Customer customer = (Customer) session.load(Customer.class, cid);
			session.delete(customer);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}

	}

	@Override
	public void updateCustomer(Customer customer) {

	}

	@Override
	public List<Customer> getAllCustomer() {
		Transaction transaction = null;
		List<Customer> customers = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			Criteria criteria = session.createCriteria(Customer.class);
			criteria.add(Restrictions.and(Restrictions.between("age", "24", "35"),
					Restrictions.eq("city", "patna")));
			criteria.setFirstResult(1);
			criteria.setMaxResults(3);
			customers = criteria.list();
			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}

		return customers;
	}

	@Override
	public List<Customer> getCustomersByCity(String city) {
		Transaction transaction = null;
		List<Customer> customers = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			Criteria criteria = session.createCriteria(Customer.class);
			criteria = criteria.add(Restrictions.eq("city", city));
			customers = criteria.list();
			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}

		return customers;

	}

	@Override
	public Customer getCustomerByEmail(String email) {
		Transaction transaction = null;
		Customer customer = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			Criteria criteria = session.createCriteria(Customer.class);
			criteria = criteria.add(Expression.eq("email", email));
			customer = (Customer) criteria.list().get(0);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}

		return customer;

	}

}
