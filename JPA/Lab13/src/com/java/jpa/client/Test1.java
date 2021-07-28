package com.java.jpa.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.java.jpa.Customer;

public class Test1 {

	public static void main(String[] args) {
		EntityTransaction entityTransaction;
		try {
			EntityManagerFactory entityManagerFactory = Persistence
					.createEntityManagerFactory("HIBERNATE-PU");
			EntityManager entityManager = entityManagerFactory
					.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			Customer customer = new Customer("Singh", "singh@gmail.com",
					"12345");
			entityManager.persist(customer);

			Customer customer1 = new Customer("kumar", "kumar@gmail.com",
					"12345");
			entityManager.persist(customer1);

			Customer customer2 = new Customer("dhiraj", "dhiraj@gmail.com",
					"12345");
			entityManager.persist(customer2);

			Customer customer3 = new Customer("dk", "dk@gmail.com",
					"12345");
			entityManager.persist(customer3);

			Customer customer4 = new Customer("mk", "mk@gmail.com",
					"12345");
			entityManager.persist(customer4);

			entityTransaction.commit();
			entityManager.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
