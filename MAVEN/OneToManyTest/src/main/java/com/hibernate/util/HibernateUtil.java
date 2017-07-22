package com.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory SESSION_FACTORY;
	static {
		Configuration configuration = new Configuration();
		configuration = configuration.configure();
		SESSION_FACTORY = configuration.buildSessionFactory();
	}

	public static SessionFactory getsSessionFactory() {
		return SESSION_FACTORY;
	}

}
