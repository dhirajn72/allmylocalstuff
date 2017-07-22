package com.hibernate.dao;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.persistence.Customer;
import com.hibernate.persistence.CustomerTo;
import com.hibernate.util.HibernateUtil;

public class HibernateTemplate {

	public static List getList(String hql, Object... args) {
		Transaction transaction = null;
		List<CustomerTo> customers = new LinkedList<CustomerTo>();
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			Query query2 = session.createQuery(hql);

			
			
			for (int i = 0; i < args.length; i++) {
				query2 = query2.setParameter(i, args[i]);
			}
			List<Customer> cust = query2.list();
			for (Customer c : cust) {
				customers.add(new CustomerTo(c.getCid(), c.getCname(), c
						.getEmail(), c.getPhone(), c.getAge(), c.getSallary(),
						c.getCtype(), c.getCity(), c.getState()));
			}

			transaction.commit();
			session.close();

		} catch (Exception e) {
			if (transaction != null)
				transaction.rollback();
		}

		return customers;

	}

}
