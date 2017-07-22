package com.java.jpa.tableperclass.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.java.jpa.tableperclass.WeekdayStudent;
import com.java.jpa.util.JPAUtil;

public class Test2 {

	public static void main(String[] args) {
		EntityTransaction entityTransaction = null;
		try {
			EntityManager entityManager = JPAUtil.getEntityManagerFactory()
					.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			WeekdayStudent weekdayStudent = (WeekdayStudent) entityManager
					.getReference(WeekdayStudent.class, 1);
			System.out.println(weekdayStudent);

			entityTransaction.commit();
			entityManager.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (entityTransaction != null)
				entityTransaction.rollback();

		}

	}

}
