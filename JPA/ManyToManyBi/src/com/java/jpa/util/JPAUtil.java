package com.java.jpa.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static final EntityManagerFactory entityManagerFactory;
	static {
		entityManagerFactory = Persistence
				.createEntityManagerFactory("JLCINDIA-PU");
	}

	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

}
