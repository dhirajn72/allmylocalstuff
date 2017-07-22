package com.java.jpa.persistence;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.java.jpa.Customer;
import com.java.jpa.to.CustomerTO;
import com.java.jpa.util.JpaUtil;

public class JPATemplate {

	public static void add(Customer to) {
		EntityTransaction entityTransaction = null;
		try {
			EntityManager entityManager = JpaUtil.getEntityManagerFactory()
					.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(to);
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
			EntityManager entityManager = JpaUtil.getEntityManagerFactory()
					.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			Customer customer = (Customer) entityManager.getReference(
					Customer.class, cid);
			entityManager.remove(customer);

			entityTransaction.commit();
			entityManager.close();
		} catch (Exception e) {
			e.printStackTrace();
			if (entityTransaction != null)
				entityTransaction.rollback();

		}

	}

	public static void merge(Customer cust) {
		EntityTransaction entityTransaction = null;
		try {
			EntityManager entityManager = JpaUtil.getEntityManagerFactory()
					.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Customer customer = (Customer) entityManager.getReference(
					Customer.class, cust.getCid());
			customer.setCname(cust.getCname());
			customer.setEmail(cust.getEmail());
			customer.setPhone(cust.getPhone());
			entityManager.merge(customer);
			entityTransaction.commit();
			entityManager.close();
		} catch (Exception e) {
			e.printStackTrace();
			if (entityTransaction != null)
				entityTransaction.rollback();

		}

	}

	public static Customer load(Class class1, Serializable cid) {
		EntityTransaction entityTransaction = null;
		Customer customer = null;
		try {
			EntityManager entityManager = JpaUtil.getEntityManagerFactory()
					.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			customer = (Customer) entityManager.getReference(class1, cid);

			entityTransaction.commit();
			entityManager.close();
		} catch (Exception e) {
			e.printStackTrace();
			if (entityTransaction != null)
				entityTransaction.rollback();

		}

		return customer;
	}

}
