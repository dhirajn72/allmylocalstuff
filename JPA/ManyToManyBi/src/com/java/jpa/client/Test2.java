package com.java.jpa.client;

import java.util.Set;

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

			Vehicle vehicle = (Vehicle) entityManager.getReference(
					Vehicle.class, 2);
			System.out.println(vehicle);
			Set<Customer> customers = vehicle.getCustomer();
			for (Customer c : customers) {
				System.out.println(c);
			}
			entityTransaction.commit();
			entityManager.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (entityTransaction != null)
				entityTransaction.rollback();
		}

	}
}
