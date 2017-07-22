package com.java.spring.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.java.spring.Customer;
import com.java.spring.jpautil.JPAUtil;

public class Test1 {

	public static void main(String[] args) {
		EntityTransaction entityTransaction = null;
		try {
			EntityManager entityManager = JPAUtil.getEntityManagerFactory()
					.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			Customer customer = (Customer) entityManager
					.find(Customer.class, 2);
			System.out.println(customer);

			entityTransaction.commit();
			entityManager.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (entityTransaction != null)
				entityTransaction.rollback();

		}

	}

}
