package com.java.jpa.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.java.jpa.peristence.Vehicle;
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
			System.out.println("Vehicle->customer");

			Vehicle address = (Vehicle) entityManager.getReference(
					Vehicle.class, 2);
			System.out.println(address);

			Customer customer = address.getCustomer();
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
