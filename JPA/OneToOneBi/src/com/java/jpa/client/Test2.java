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
			System.out.println("Customer->Address");
			Customer customer = (Customer) entityManager.getReference(
					Customer.class, 3);
			System.out.println(customer);
			Address address = customer.getAddress();
			System.out.println(address);

			System.out.println("Address->Customer");
			Address address2 = (Address) entityManager.getReference(
					Address.class, 1);
			System.out.println(address2);
			Customer customer2 = address2.getCustomer();
			System.out.println(customer2);

			entityTransaction.commit();
			entityManager.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (entityTransaction != null)
				entityTransaction.rollback();
		}

	}
}
