package com.java.spring.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.java.spring.Customer;
import com.java.spring.jpautil.JPAUtil;

public class Test {

	public static void main(String[] args) {
		EntityTransaction entityTransaction = null;

		try {
			EntityManager entityManager = JPAUtil.getEntityManagerFactory()
					.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			Customer customer = new Customer("Singh", "singh@gmail.com",
					"9743854499", "22/09/1990");
			entityManager.persist(customer);

			entityTransaction.commit();
			entityManager.close();
		} catch (Exception e) {
			e.printStackTrace();
			if (entityTransaction != null)
				entityTransaction.rollback();
		}

	}

}
