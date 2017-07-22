package com.hibernate.core;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.hibernate.utils.HibernateUtils;

public class Test {

	HibernateTemplate hibernateTemplate;

	JpaTransactionManager jpaTransactionManager;

	DataSourceTransactionManager dataSourceTransactionManager;

	public void show() {
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			// bussiness code goes here

			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (transaction != null) {
				transaction.rollback();
			}
		}

	}

	public void detachedCri() {
		TransactionStatus transactionStatus = null;
		try {
			TransactionDefinition td = new DefaultTransactionDefinition();
			transactionStatus = dataSourceTransactionManager.getTransaction(td);

		} catch (Exception e) {
			// TODO: handle exception

			dataSourceTransactionManager.rollback(transactionStatus);
		}
	}

}
