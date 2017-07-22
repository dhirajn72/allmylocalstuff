package org.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jpa.test.bean.Student;

public class Test1 {

	public static void main(String[] args) {

		EntityTransaction transaction = null;
		try {
			EntityManagerFactory managerFactory = Persistence
					.createEntityManagerFactory("myapp");
			EntityManager manager = managerFactory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();

			Student student = new Student("Singh", "22/09/1990", "MCA");
			manager.persist(student);
			transaction.commit();
			manager.close();
			System.out.println("Object persisted successfully !!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
