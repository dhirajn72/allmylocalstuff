package com.java.jpa.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.java.jpa.Customer;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityTransaction entityTransaction;
		try {
			EntityManagerFactory entityManagerFactory = Persistence
					.createEntityManagerFactory("HIBERNATE-PU");
			EntityManager entityManager = entityManagerFactory
					.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Customer customer = (Customer) entityManager.getReference(
					Customer.class, 5);

			System.out.println(customer);

			entityTransaction.commit();
			entityManager.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
