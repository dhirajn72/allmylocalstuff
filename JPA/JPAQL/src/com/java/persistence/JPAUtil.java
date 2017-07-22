package com.java.persistence;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY;
	static {
		ENTITY_MANAGER_FACTORY = Persistence
				.createEntityManagerFactory("HIBERNATE-PU");
	}

	public static EntityManagerFactory getEntityManagerFactory() {
		return ENTITY_MANAGER_FACTORY;
	}

}
