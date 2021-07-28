package com.java.jpa.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.java.jpa.peristence.Address;
import com.java.jpa.peristence.Customer;
import com.java.jpa.util.JPAUtil;

public class Test1 {
	public static void main(String[] args) {
		EntityTransaction entityTransaction = null;
		try {
			EntityManager entityManager = JPAUtil.getEntityManagerFactory()
					.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			Customer customer = new Customer("Singh", "singh@gmail.com",
					"12345");
			entityManager.persist(customer);
			Address address = new Address("HEC", "Jharkhand", "India");
			entityManager.persist(address);
			customer.setAddress(address);

			Customer customer1 = new Customer("kumar", "kumar@gmail.com",
					"12345");
			entityManager.persist(customer1);
			Address address1 = new Address("Aurangabad", "Bihar", "India");
			entityManager.persist(address1);
			customer1.setAddress(address1);

			Customer customer2 = new Customer("Dhiraj", "dhiraj@gmail.com",
					"12345");
			entityManager.persist(customer2);
			Address address2 = new Address("chhakanBigha", "Bihar", "India");
			entityManager.persist(address2);
			customer2.setAddress(address2);

			entityTransaction.commit();
			entityManager.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (entityTransaction != null)
				entityTransaction.rollback();
		}

	}
}
