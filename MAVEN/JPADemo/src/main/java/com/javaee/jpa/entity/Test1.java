package com.javaee.jpa.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.javaee.jpa.Customer;

public class Test1 {
	public static void main(String[] args) {

		try {
			EntityManagerFactory emf = Persistence
					.createEntityManagerFactory("JPA-PU");
			EntityManager em = emf.createEntityManager();
			EntityTransaction tx = em.getTransaction();
			tx.begin();

			Customer c1 = new Customer("singh", "singh@gmail.com",
					Long.parseLong("9743854499"));
			em.persist(c1);
			tx.commit();
			em.close();
			System.out.println("Check DB !!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
