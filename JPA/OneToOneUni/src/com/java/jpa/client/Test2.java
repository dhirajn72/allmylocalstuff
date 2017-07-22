package com.java.jpa.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.java.jpa.peristence.Address;
import com.java.jpa.peristence.Customer;
import com.java.jpa.util.JPAUtil;

public class Test2 {

	public static void main(String[] args) {
		EntityTransaction entityTransaction = null;
		try {
			EntityManager entityManager = JPAUtil.getEntityManagerFactory()
					.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			Customer customer = (Customer) entityManager.getReference(
					Customer.class, 3);
			System.out.println(customer);
			Address address = customer.getAddress();
			System.out.println(address);

			entityTransaction.commit();
			entityManager.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (entityTransaction != null)
				entityTransaction.rollback();
		}

	}
}
