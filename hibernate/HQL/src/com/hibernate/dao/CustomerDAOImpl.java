package com.hibernate.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.persistence.Customer;
import com.hibernate.to.CustomerTO;
import com.hibernate.util.HibernateUtil;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public void addCustomer(CustomerTO to) {
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			Customer customer = new Customer(to.getCname(), to.getEmail(),
					to.getPhone(), to.getAge(), to.getCompany());
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
	public void deleteCustomerByCid(int cid) {
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
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
	public void updateCustomer(CustomerTO to) {
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Customer customer = (Customer) session.load(Customer.class,
					to.getCid());
			customer.setCname(to.getCname());
			customer.setEmail(to.getEmail());
			customer.setCompany(to.getCompany());

			session.update(customer);
			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}

	}

	@Override
	public List<CustomerTO> getAllCustomers() {
		Transaction transaction = null;
		List<CustomerTO> list = new ArrayList<CustomerTO>();
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			String query = "from Customer c";
			Query query2 = session.createQuery(query);
			query2.setCacheable(true);
			List<Customer> customers = query2.list();
			for (Customer cust : customers) {
				CustomerTO to = new CustomerTO(cust.getCid(), cust.getCname(),
						cust.getEmail(), cust.getPhone(), cust.getAge(),
						cust.getCompany());
				list.add(to);
			}

			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}
		return list;
	}

	@Override
	public List<CustomerTO> getAllCustomersByCompany(String cname) {
		Transaction transaction = null;
		List<CustomerTO> list = new ArrayList<CustomerTO>();
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			String query = "from Customer c where c.company=?";
			Query query2 = session.createQuery(query);
			query2.setString(0, cname);

			List<Customer> customers = query2.list();
			for (Customer cust : customers) {
				CustomerTO to = new CustomerTO(cust.getCid(), cust.getCname(),
						cust.getEmail(), cust.getPhone(), cust.getAge(),
						cust.getCompany());
				list.add(to);
			}

		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}

		return list;
	}

	@Override
	public CustomerTO getCustomerByCid(int cid) {
		Transaction transaction = null;
		CustomerTO customerTO = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Customer cust = (Customer) session.load(Customer.class, cid);
			customerTO = new CustomerTO(cust.getCid(), cust.getCname(),
					cust.getEmail(), cust.getPhone(), cust.getAge(),
					cust.getCompany());
			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}

		return customerTO;
	}

}
