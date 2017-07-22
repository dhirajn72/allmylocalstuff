package com.java.jpa.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

	private static EntityManagerFactory entityManagerFactory;
	static {
		entityManagerFactory = Persistence
				.createEntityManagerFactory("HIBERNATE-PU");
	}

	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}
}
