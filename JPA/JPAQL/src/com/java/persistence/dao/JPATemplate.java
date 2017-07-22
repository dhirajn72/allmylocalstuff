package com.java.persistence.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.java.persistence.Customer;
import com.java.persistence.JPAUtil;
import com.java.persistence.to.CustomerTO;

public class JPATemplate {

	public static void add(Object cls) {
		EntityTransaction entityTransaction = null;
		try {
			EntityManager entityManager = JPAUtil.getEntityManagerFactory()
					.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(cls);
			entityTransaction.commit();
			entityManager.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (entityTransaction != null)
				entityTransaction.rollback();
		}

	}

	public static void remove(int cid) {
		EntityTransaction entityTransaction = null;
		try {
			EntityManager entityManager = JPAUtil.getEntityManagerFactory()
					.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(entityManager
					.getReference(Customer.class, cid));
			entityTransaction.commit();
			entityManager.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (entityTransaction != null)
				entityTransaction.rollback();
		}

	}

	public static void update(CustomerTO cust) {
		EntityTransaction entityTransaction = null;
		try {
			EntityManager entityManager = JPAUtil.getEntityManagerFactory()
					.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			Customer customer = entityManager.getReference(Customer.class,
					cust.getCid());
			customer.setCname(cust.getCname());
			customer.setEmail(cust.getEmail());
			customer.setPhone(cust.getPhone());
			customer.setCity(cust.getCity());
			entityManager.merge(customer);

			entityTransaction.commit();
			entityManager.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (entityTransaction != null)
				entityTransaction.rollback();
		}

	}

	@SuppressWarnings("unchecked")
	public static Object find(String query, Object... args) {
		EntityTransaction entityTransaction = null;
		List<Object> list = null;
		try {
			EntityManager entityManager = JPAUtil.getEntityManagerFactory()
					.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			Query query2 = entityManager.createQuery(query);
			for (int i = 0; i < args.length; i++) {
				query2.setParameter(i + 1, args[i]);
			}

			list = (List<Object>) query2.getResultList();

			entityTransaction.commit();
			entityManager.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (entityTransaction != null)
				entityTransaction.rollback();
		}
		return list;

	}

	public static List<Object> find(String query) {
		EntityTransaction entityTransaction = null;
		List<Object> list = null;
		try {
			EntityManager entityManager = JPAUtil.getEntityManagerFactory()
					.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Query query2 = entityManager.createQuery(query);
			list = query2.getResultList();
			entityTransaction.commit();
			entityManager.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (entityTransaction != null)
				entityTransaction.rollback();
		}
		return list;

	}

	public static List<Object> find(String query, String city) {
		EntityTransaction entityTransaction = null;

		List<Object> list = null;
		try {
			EntityManager entityManager = JPAUtil.getEntityManagerFactory()
					.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			Query query2 = entityManager.createQuery(query);
			query2.setParameter(1, city);
			list = query2.getResultList();
			entityTransaction.commit();
			entityManager.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (entityTransaction != null)
				entityTransaction.rollback();
		}
		return list;

	}
}
