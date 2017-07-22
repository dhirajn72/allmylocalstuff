package com.java.jpa.tableperconcreteclass.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.java.jpa.tableperconcreteclass.WeekdayStudent;
import com.java.jpa.util.JPAUtil;

public class Test1 {

	public static void main(String[] args) {
		EntityTransaction entityTransaction = null;
		try {
			EntityManager entityManager = JPAUtil.getEntityManagerFactory()
					.createEntityManager();

			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			WeekdayStudent weekdayStudent = new WeekdayStudent("Singh",
					"singhold@gmail.com", "9743854499", "singhnew@gmail",
					"9742765205", "dk@gmail.com", "9742765205");
			weekdayStudent.setSid(01);
			entityManager.persist(weekdayStudent);
			entityTransaction.commit();
			entityManager.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (entityTransaction != null)
				entityTransaction.rollback();
		}

	}

}
