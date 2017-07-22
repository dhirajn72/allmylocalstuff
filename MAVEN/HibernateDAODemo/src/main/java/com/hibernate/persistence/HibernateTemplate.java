package com.hibernate.persistence;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.to.CustomerTO;
import com.hibernate.util.HibernateUtil;

public class HibernateTemplate {

	public static void add(CustomerTO to) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();

			session.persist(new Customer(to.getCid(), to.getCname(), to
					.getEmail(), to.getPhone(), to.getAge(), to.getCity(), to
					.getSallary(), to.getCtype()));

			transaction.commit();
			session.flush();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void update(CustomerTO to) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			Customer customer = (Customer) session.load(Customer.class,
					to.getCid());
			customer.setCname(to.getCname());
			customer.setEmail(to.getEmail());
			customer.setPhone(to.getPhone());
			customer.setAge(to.getAge());
			customer.setCity(to.getCity());
			customer.setSallary(to.getSallary());
			customer.setCtype(to.getCtype());
			session.update(customer);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void delete(int cid) {
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
		}

	}

	public static List findList(String querry, Object... arr) {
		Transaction transaction = null;
		List list = new ArrayList();
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			Query query = session.createQuery(querry);
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
				query = query.setParameter(i, arr[i]);
			}
			list = query.list();
			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();

		}
		return list;
	}

	public static double getSalary(int limit, int offset) {
		String hql = "select sallary from Customer order by sallary desc limit ? offset ?";
		Transaction transaction = null;
		double salary = 0;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			Query query = session.createQuery(hql);
			query = query.setParameter(1, limit);
			query = query.setParameter(2, offset);

			Object ob = query.list().get(0);
			salary = new Double(Double.parseDouble(ob.toString()));
			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();

		}
		return salary;
	}

}
