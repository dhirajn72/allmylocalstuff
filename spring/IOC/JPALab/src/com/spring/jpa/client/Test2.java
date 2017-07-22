package com.spring.jpa.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.spring.jpa.Customer;

public class Test2 {

	public static void main(String[] args) {

		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence
					.createEntityManagerFactory("JLCINDIA-PU");
			EntityManager entityManager = entityManagerFactory
					.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			Customer customer = (Customer) entityManager.getReference(
					Customer.class, 4);
			System.out.println(customer);

			entityTransaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			if (entityTransaction != null)
				entityTransaction.rollback();
		}

	}

}
