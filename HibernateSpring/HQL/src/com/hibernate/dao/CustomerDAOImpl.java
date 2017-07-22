package com.hibernate.dao;

import java.sql.Connection;
import java.util.LinkedList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.persistence.Customer;
import com.hibernate.persistence.CustomerTo;
import com.hibernate.util.HibernateUtil;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public void addCustomer(CustomerTo to) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			// Connection connection = session.connection();
			// System.out.println("con:" + connection);
			transaction = session.beginTransaction();
			Customer customer = new Customer(to.getCname(), to.getEmail(),
					to.getPhone(), to.getAge(), to.getSallary(), to.getCtype(),
					to.getCity(), to.getState());
			session.save(customer);
			transaction.commit();
			session.close();

		} catch (Exception e) {
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
			if (transaction != null)
				transaction.rollback();
		}
	}

	@Override
	public void updateCustomer(CustomerTo to) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			Customer cust = (Customer) session
					.load(Customer.class, to.getCid());
			cust.setCname(to.getCname());
			cust.setEmail(to.getEmail());
			cust.setPhone(to.getPhone());
			cust.setAge(to.getAge());
			cust.setSallary(to.getSallary());
			cust.setCtype(to.getCtype());
			cust.setCity(to.getCity());
			cust.setState(to.getState());
			session.update(cust);

			transaction.commit();
			session.close();

		} catch (Exception e) {
			if (transaction != null)
				transaction.rollback();
		}
	}

	@Override
	public List<CustomerTo> getAllCustomer() {
		String query = "from Customer c";
		return HibernateTemplate.getList(query);
	}

	@Override
	public List<CustomerTo> getCustomerByCity(String city) {
		String hql = "from Customer cust where cust.city=?";
		return HibernateTemplate.getList(hql, city);
	}

	@Override
	public CustomerTo getCustomerEmail(String email) {
		CustomerTo to = null;
		String query = "from Customer c where c.email=?";
		return (CustomerTo) HibernateTemplate.getList(query, email).get(0);
	}

	@Override
	public void deleteCustomerByEmail(String email) {
		String query = "from Customer c where c.email=?";

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Query query2 = session.createQuery(query);
		Object ob = query2.setParameter(0, email).list().get(0);

		session.delete(ob);
		tx.commit();
		session.close();

	}
}
